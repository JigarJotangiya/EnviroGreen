package com.example.envirogreen.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.envirogreen.R;

public class MainActivity extends AppCompatActivity {

    CardView fruit,flover,fertilisers,seeds,gardeningtools,pots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruit=findViewById(R.id.fruit);
        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FruitPlant.class);
                startActivity(intent);

            }
        });

        flover=findViewById(R.id.flover);
        flover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,FlowerPlants.class);
                startActivity(intent);

            }
        });

        fertilisers=findViewById(R.id.fertilisers);
        fertilisers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Fertiliser.class);
                startActivity(intent);

            }
        });

        seeds=findViewById(R.id.seeds);
        seeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,SeedsPlant.class);
                startActivity(intent);

            }
        });

        gardeningtools=findViewById(R.id.gardeningtools);
        gardeningtools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,GardeningTools.class);
                startActivity(intent);

            }
        });

        pots=findViewById(R.id.pots);
        pots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Pots.class);
                startActivity(intent);

            }
        });


    }
}