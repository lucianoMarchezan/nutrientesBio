package com.nutrientesbio.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.nutrientesbio.R;

public class RotuloDetalhes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotulo_detalhes);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }
        Intent myIntent = new Intent(getApplicationContext(), RotulosMain.class);
        startActivityForResult(myIntent, 0);
        return true;
    }

    /*public void voltaRotulos(View view) {

        Intent lIntent = new Intent();
        lIntent.setClass(this, RotulosMain.class);
        startActivity(lIntent);

    }*/
}
