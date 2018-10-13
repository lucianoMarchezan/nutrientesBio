package com.nutrientesbio.View;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.nutrientesbio.Model.Alternativa;
import com.nutrientesbio.Model.Pergunta;
import com.nutrientesbio.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Luciano on 21/02/2017.
 */

public class QuestaoQuatro extends Activity{

    MyCustomAdapter dataAdapter;
    Pergunta p1;
    ArrayList<Alternativa> alternativas;
    int[] tentativas = new int[4];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Intent it = getIntent();
        tentativas = it.getIntArrayExtra("tentativas");
        tentativas[3]=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questoes_main);

        //Generate list View from ArrayList
        criaPerguntas();
        displayListView(p1, alternativas);

        checkButtonClick();

    }

    public void criaPerguntas() {
        //Array list of alternativas
        p1 = new Pergunta();
        p1.setQuestao("4)\tClara foi ao mercado e ao escolher alimentos industrializados, resolveu ler os rótulos. " +
                "Encontrou na tabela nutricional destes alimentos palavras como gorduratrans, gordura total e gordura insaturada." +
                " Quais alimentos são ricos em gordura trans?");

        alternativas = new ArrayList<Alternativa>();
        Alternativa alt1 = new Alternativa("Bolachinha Recheada", false);
        alternativas.add(alt1);

        p1.getRespostas().add(alt1);

        alt1 = new Alternativa("Sorvete Industrializado", false);
        alternativas.add(alt1);

        p1.getRespostas().add(alt1);
        alt1 = new Alternativa("Pipoca de Microondas", false);
        alternativas.add(alt1);

        p1.getRespostas().add(alt1);
        alt1 = new Alternativa("Salgadinhos", false);
        alternativas.add(alt1);
        p1.getRespostas().add(alt1);


        alt1 = new Alternativa("Iogurte", false);
        alternativas.add(alt1);
        alt1 = new Alternativa("Pão", false);
        alternativas.add(alt1);
        alt1 = new Alternativa("Leite", false);
        alternativas.add(alt1);
        alt1 = new Alternativa("Gelatina", false);
        alternativas.add(alt1);

        long seed = System.nanoTime();
        Collections.shuffle(alternativas, new Random(seed));
        p1.setAlternativas(alternativas);
    }

    private void displayListView(Pergunta p1, ArrayList<Alternativa> alternativas) {


        //create an ArrayAdaptar from the String Array
        dataAdapter = new MyCustomAdapter(this,
                R.layout.lista_alternativas, alternativas);
        ListView listView = (ListView) findViewById(R.id.listAlternativas);
        // Assign adapter to ListView
        listView.setAdapter(dataAdapter);
        TextView textView = (TextView) findViewById(R.id.textQuestao);
        textView.setText(p1.getQuestao());


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Alternativa alternativa = (Alternativa) parent.getItemAtPosition(position);

            }
        });

    }

    private class MyCustomAdapter extends ArrayAdapter<Alternativa> {

        private ArrayList<Alternativa> alternativasList;

        public MyCustomAdapter(Context context, int textViewResourceId,
                               ArrayList<Alternativa> alternativasList) {
            super(context, textViewResourceId, alternativasList);
            this.alternativasList = new ArrayList<Alternativa>();
            this.alternativasList.addAll(alternativasList);
        }


        private class ViewHolder {

            CheckBox name;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            MyCustomAdapter.ViewHolder holder = null;
            Log.v("ConvertView", String.valueOf(position));


            LayoutInflater vi = (LayoutInflater) getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R.layout.lista_alternativas, null);

            holder = new MyCustomAdapter.ViewHolder();
            holder.name = (CheckBox) convertView.findViewById(R.id.checkBoxAlternativa);
            convertView.setTag(holder);

            holder.name.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    CheckBox cb = (CheckBox) v;
                    Alternativa alternativa = (Alternativa) cb.getTag();

                    alternativa.setSelected(cb.isChecked());
                }
            });

            Alternativa alternativa = alternativasList.get(position);
            holder.name.setText(alternativa.getDescricao());
            holder.name.setChecked(alternativa.isSelected());
            holder.name.setTag(alternativa);

            return convertView;

        }

    }

    private void checkButtonClick() {


        Button myButton = (Button) findViewById(R.id.findSelected);
        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                boolean respostaCerta = false;
                int respostas = 0;
                StringBuffer responseText = new StringBuffer();
                ArrayList<Alternativa> alternativaArrayList = dataAdapter.alternativasList;
                for (int i = 0; i < alternativaArrayList.size(); i++) {
                    Alternativa alternativa = alternativaArrayList.get(i);
                    if (alternativa.isSelected()) {

                        for (int j = 0; j < p1.getRespostas().size(); j++) {
                            Alternativa alt = p1.getRespostas().get(j);
                            if (alt.getDescricao() == alternativa.getDescricao()) {

                                j = p1.getRespostas().size();
                                responseText = new StringBuffer();
                                respostas++;
                            } else if (j + 1 == p1.getRespostas().size()) {
                                responseText = new StringBuffer();
                                respostas--;
                                responseText.append("Resposta Errada! Tente outra vez!");
                                break;
                            }

                        }


                    }
                }

                if (respostas == p1.getRespostas().size()) {
                    respostaCerta = true;
                    tentativas[3]++;
                    responseText.append("Resposta Correta!!");

                } else {
                    responseText = new StringBuffer();
                    tentativas[3]++;
                    responseText.append("Resposta Errada! Tente outra vez!");

                }

                Toast.makeText(getApplicationContext(),
                        responseText, Toast.LENGTH_LONG).show();

                if (respostaCerta){
                    proximaQuestao();
                }

            }
        });

    }
    public void proximaQuestao(){
        Intent lIntent = new Intent();
        lIntent.setClass(this, TelaDeParabens.class);
        lIntent.putExtra("tentativas", tentativas);
        startActivity(lIntent);

    }
}
