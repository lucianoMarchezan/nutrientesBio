package com.nutrientesbio.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.nutrientesbio.R;

public class TelaDeParabens extends AppCompatActivity {
    int[] tentativas = new int[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent it = getIntent();
        tentativas = it.getIntArrayExtra("tentativas");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_parabens);
        TextView t1,t2,t3,t4;
        t1 = (TextView) findViewById(R.id.tentativas1);
        t2 = (TextView) findViewById(R.id.tentativas2);
        t3 = (TextView) findViewById(R.id.tentativas3);
        t4 = (TextView) findViewById(R.id.tentativas4);

        t1.setText(String.valueOf(tentativas[0]));
        t2.setText(String.valueOf(tentativas[1]));
        t3.setText(String.valueOf(tentativas[2]));
        t4.setText(String.valueOf(tentativas[3]));


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
}
