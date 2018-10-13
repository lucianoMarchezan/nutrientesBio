package com.nutrientesbio.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nutrientesbio.R;
import com.nutrientesbio.View.DicionarioView;

public class MainActivityView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent lIntent = new Intent();
        lIntent.setClass(this, DicionarioView.class);
        startActivity(lIntent);

    }

    public void exibeQuestoes(View view){
        Intent lIntent = new Intent();
        lIntent.setClass(this, ListViewCheckboxesActivity.class);
        startActivity(lIntent);

    }

    public void exibeSobre(View view){
        Intent lIntent = new Intent();
        lIntent.setClass(this, SobreMain.class);
        startActivity(lIntent);

    }

    public void exibeRotulo(View view){
        Intent lIntent = new Intent();
        lIntent.setClass(this, RotulosMain.class);
        startActivity(lIntent);

    }

}
