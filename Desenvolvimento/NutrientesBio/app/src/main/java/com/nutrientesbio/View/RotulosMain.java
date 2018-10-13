package com.nutrientesbio.View;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.nutrientesbio.R;

public class RotulosMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotulos_main);

    }

    public void exibeDetalhes(View view) {

        Intent lIntent = new Intent();

        lIntent.setClass(this, RotuloDetalhes.class);
        startActivity(lIntent);

    }

    public void voltaMain(View view) {

        Intent lIntent = new Intent();
        lIntent.setClass(this, MainActivityView.class);
        startActivity(lIntent);

    }


}
