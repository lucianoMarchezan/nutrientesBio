package com.nutrientesbio.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nutrientesbio.R;

public class RotuloDetalhes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotulo_detalhes);
    }

    public void voltaRotulos(View view) {

        Intent lIntent = new Intent();
        lIntent.setClass(this, RotulosMain.class);
        startActivity(lIntent);

    }
}
