package com.nutrientesbio.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.nutrientesbio.DAO.BancoController;
import com.nutrientesbio.Model.Nutriente;
import com.nutrientesbio.R;

import java.util.ArrayList;

/**
 * Created by Luciano on 04/09/2016.
 */
public class NutrienteView extends AppCompatActivity {
    public ArrayList<Nutriente> nutrientes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nutriente_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        TextView campoTexto = (TextView) findViewById(R.id.nomeNutrienteText);
        TextView descNutri = (TextView) findViewById(R.id.descricaoText);


        String mostraTexto = null;


        if (params != null) {
            mostraTexto = params.getString("mensagem");
        }
        BancoController crud = new BancoController(getBaseContext());
        nutrientes = crud.consultarNutrientes();
        for (Nutriente n : nutrientes) {
            if (n.getNome().equalsIgnoreCase(mostraTexto)) {
                campoTexto.setText(mostraTexto);
                descNutri.setText(n.getDescricao());
            }
        }

        descNutri.setMovementMethod(new ScrollingMovementMethod());
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }
        Intent myIntent = new Intent(getApplicationContext(), DicionarioView.class);
        startActivityForResult(myIntent, 0);
        return true;
    }

   /* public void voltarDicionario(View view) {
        Intent lIntent = new Intent();
        lIntent.setClass(this, DicionarioView.class);
        startActivity(lIntent);
    }*/
}
