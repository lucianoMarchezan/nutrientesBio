package com.nutrientesbio.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import com.nutrientesbio.DAO.BancoController;
import com.nutrientesbio.DAO.CriaBanco;
import com.nutrientesbio.Model.Nutriente;
import com.nutrientesbio.R;

public class DicionarioView extends Activity {

    public ArrayList<Nutriente> nutrientes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dicionariomain);
        //cria banco de dados
        BancoController crud = new BancoController(getBaseContext());
        crud.carregaDados();
        nutrientes = crud.consultarNutrientes();

        //lista
        ExpandableListView elvCompra = (ExpandableListView) findViewById(R.id.expandableListView2);

// <editor-fold defaultstate="collapsed" desc="cria os grupos">
        List<String> lstGrupos = new ArrayList<>();
        lstGrupos.add("A");
        lstGrupos.add("B");
        lstGrupos.add("C");
        lstGrupos.add("D");
        lstGrupos.add("E");
        lstGrupos.add("F");
        lstGrupos.add("G");
        lstGrupos.add("I");
        lstGrupos.add("L");
        lstGrupos.add("M");
        lstGrupos.add("N");
        lstGrupos.add("P");
        lstGrupos.add("R");
        lstGrupos.add("S");
        lstGrupos.add("T");
        lstGrupos.add("V");
        lstGrupos.add("Z");
        List<Nutriente> letraA = new ArrayList<>();
        List<Nutriente> letraB = new ArrayList<>();
        List<Nutriente> letraC = new ArrayList<>();
        List<Nutriente> letraD = new ArrayList<>();
        List<Nutriente> letraE = new ArrayList<>();
        List<Nutriente> letraF = new ArrayList<>();
        List<Nutriente> letraG = new ArrayList<>();
        List<Nutriente> letraI = new ArrayList<>();
        List<Nutriente> letraL = new ArrayList<>();
        List<Nutriente> letraM = new ArrayList<>();
        List<Nutriente> letraN = new ArrayList<>();
        List<Nutriente> letraP = new ArrayList<>();
        List<Nutriente> letraR = new ArrayList<>();
        List<Nutriente> letraS = new ArrayList<>();
        List<Nutriente> letraT = new ArrayList<>();

        List<Nutriente> letraV = new ArrayList<>();
        List<Nutriente> letraZ = new ArrayList<>();
        // cria os itens de cada grupo
        for (Nutriente n : nutrientes) {
            if (n.getNome().substring(0, 1).equalsIgnoreCase("a")) {
                letraA.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("b")) {
                letraB.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("c")) {
                letraC.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("d")) {
                letraD.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("e")) {
                letraE.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("f")) {
                letraF.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("g")) {
                letraG.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("i")) {
                letraI.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("l")) {
                letraL.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("m")) {
                letraM.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("n")) {
                letraN.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("p")) {
                letraP.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("r")) {
                letraR.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("s")) {
                letraS.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("t")) {
                letraT.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("V")) {
                letraV.add(n);
            } else if (n.getNome().substring(0, 1).equalsIgnoreCase("z")) {
                letraZ.add(n);
            }
        }

        // cria o "relacionamento" dos grupos com seus itens
        HashMap<String, List<Nutriente>> lstItensGrupo = new HashMap<>();
        lstItensGrupo.put(lstGrupos.get(0), letraA);
        lstItensGrupo.put(lstGrupos.get(1), letraB);
        lstItensGrupo.put(lstGrupos.get(2), letraC);
        lstItensGrupo.put(lstGrupos.get(3), letraD);
        lstItensGrupo.put(lstGrupos.get(4), letraE);
        lstItensGrupo.put(lstGrupos.get(5), letraF);
        lstItensGrupo.put(lstGrupos.get(6), letraG);
        lstItensGrupo.put(lstGrupos.get(7), letraI);
        lstItensGrupo.put(lstGrupos.get(8), letraL);
        lstItensGrupo.put(lstGrupos.get(9), letraM);
        lstItensGrupo.put(lstGrupos.get(10), letraN);
        lstItensGrupo.put(lstGrupos.get(11), letraP);
        lstItensGrupo.put(lstGrupos.get(12), letraR);
        lstItensGrupo.put(lstGrupos.get(13), letraS);
        lstItensGrupo.put(lstGrupos.get(14), letraT);
        lstItensGrupo.put(lstGrupos.get(15), letraV);
        lstItensGrupo.put(lstGrupos.get(16), letraZ);
        //lstItensGrupo.put(lstGrupos.get(15), letraZ);
        //</editor-fold>
        // cria um adaptador (BaseExpandableListAdapter) com os dados acima
        Adaptador adaptador = new Adaptador(this, lstGrupos, lstItensGrupo);
        // define o apadtador do ExpandableListView
        elvCompra.setAdapter(adaptador);
    }


    public void exibeNutriente(View view) {
        Button b = (Button) view;
        String resposta = b.getText().toString();
        Intent lIntent = new Intent();
        Bundle params = new Bundle();
        params.putString("mensagem", resposta);
        lIntent.putExtras(params);
        lIntent.setClass(this, NutrienteView.class);
        startActivity(lIntent);

    }

    public void voltaMain(View view) {

        Intent lIntent = new Intent();
        lIntent.setClass(this, MainActivityView.class);
        startActivity(lIntent);

    }

}
