package com.example.envirogreen.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.envirogreen.FruitPlant.Cantaloupe;
import com.example.envirogreen.Pots.Ceramicpot;
import com.example.envirogreen.Pots.Cylinderpot;
import com.example.envirogreen.Pots.Magneticsucculent;
import com.example.envirogreen.Pots.Metalpot;
import com.example.envirogreen.Pots.PopPot;
import com.example.envirogreen.R;

public class Pots extends AppCompatActivity {

    CardView CERAMICPOT,CYLINDERPOT,MAGNETICSUCCULENT,METALPOT,POPPOT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pots);

        CERAMICPOT=findViewById(R.id.CERAMICPOT);
        CERAMICPOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Pots.this, Ceramicpot.class);
                startActivity(intent);

            }
        });

        CYLINDERPOT=findViewById(R.id.CYLINDERPOT);
        CYLINDERPOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Pots.this, Cylinderpot.class);
                startActivity(intent);

            }
        });

        MAGNETICSUCCULENT=findViewById(R.id.MAGNETICSUCCULENT);
        MAGNETICSUCCULENT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Pots.this, Magneticsucculent.class);
                startActivity(intent);

            }
        });

        METALPOT=findViewById(R.id.METALPOT);
        METALPOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Pots.this, Metalpot.class);
                startActivity(intent);

            }
        });

        POPPOT=findViewById(R.id.POPPOT);
        POPPOT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Pots.this, PopPot.class);
                startActivity(intent);

            }
        });

    }
}