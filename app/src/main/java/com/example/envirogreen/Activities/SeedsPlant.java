package com.example.envirogreen.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.envirogreen.R;
import com.example.envirogreen.seeds.HempSeeds;
import com.example.envirogreen.seeds.PumpkinSeeds;
import com.example.envirogreen.seeds.SesameSeeds;
import com.example.envirogreen.seeds.SunflowerSeeds;

public class SeedsPlant extends AppCompatActivity {

    CardView Flaxseeds,ChiaSeeds,HempSeeds,SesameSeeds,PumpkinSeeds,SunflowerSeeds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeds_plant);

        Flaxseeds=findViewById(R.id.Flaxseeds);
        Flaxseeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SeedsPlant.this, com.example.envirogreen.seeds.Flaxseeds.class);
                startActivity(intent);

            }
        });

        ChiaSeeds=findViewById(R.id.ChiaSeeds);
        ChiaSeeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SeedsPlant.this, com.example.envirogreen.seeds.ChiaSeeds.class);
                startActivity(intent);

            }
        });

        HempSeeds=findViewById(R.id.HempSeeds);
        HempSeeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SeedsPlant.this, HempSeeds.class);
                startActivity(intent);

            }
        });

        SesameSeeds=findViewById(R.id.SesameSeeds);
        SesameSeeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SeedsPlant.this, SesameSeeds.class);
                startActivity(intent);

            }
        });

        PumpkinSeeds=findViewById(R.id.PumpkinSeeds);
        PumpkinSeeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SeedsPlant.this, PumpkinSeeds.class);
                startActivity(intent);

            }
        });

        SunflowerSeeds=findViewById(R.id.SunflowerSeeds);
        SunflowerSeeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SeedsPlant.this, SunflowerSeeds.class);
                startActivity(intent);

            }
        });

    }
}