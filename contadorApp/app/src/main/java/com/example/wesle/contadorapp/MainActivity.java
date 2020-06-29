package com.example.wesle.contadorapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int homens = 0;
    public int mulheres = 0;
    public int totalPessoas = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv = (TextView) findViewById(R.id.textoPessoas);

        final Button homem = (Button) findViewById(R.id.homem);
        final Button mulher = (Button) findViewById(R.id.mulher);
        final Button reset = (Button) findViewById(R.id.botaoReset);

        homem.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                homens++;
                totalPessoas++;

                String mensagem = Integer.toString(totalPessoas);
                tv.setText("Total: " + mensagem + " pessoas.");
                homem.setText(Integer.toString(homens));


            }
        });

        mulher.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                mulheres++;
                totalPessoas++;

                String mensagem = Integer.toString(totalPessoas);
                tv.setText("Total: " + mensagem + " pessoas.");
                mulher.setText(Integer.toString(mulheres));


            }
        });

        reset.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                mulheres = 0;
                homens = 0;
                totalPessoas = 0;

                tv.setText("Pessoas: 0");
                homem.setText(Integer.toString(homens));
                mulher.setText(Integer.toString(mulheres));

            }
        });

    }
}
