package com.nutrientesbio.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.nutrientesbio.R;

public class SobreMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
        }
        Intent myIntent = new Intent(getApplicationContext(), MainActivityView.class);
        startActivityForResult(myIntent, 0);
        return true;
    }


    /*public void voltaMain(View view) {

        Intent lIntent = new Intent();
        lIntent.setClass(this, MainActivityView.class);
        startActivity(lIntent);

    }*/


}
