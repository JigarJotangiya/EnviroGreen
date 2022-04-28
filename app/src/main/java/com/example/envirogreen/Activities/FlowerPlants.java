package com.example.envirogreen.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.envirogreen.FlowerPlants.Chrysanthemum;
import com.example.envirogreen.FlowerPlants.Dahlia;
import com.example.envirogreen.FlowerPlants.Delphiniums;
import com.example.envirogreen.FlowerPlants.Lilium;
import com.example.envirogreen.FlowerPlants.Narcissus;
import com.example.envirogreen.FlowerPlants.Tulip;
import com.example.envirogreen.R;

public class FlowerPlants extends AppCompatActivity {

    CardView AboliPlant,DesertRose,BougainvilleaPink,CliviaLily,Compacta,Kutajah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_plants);

        AboliPlant=findViewById(R.id.AboliPlant);
        AboliPlant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FlowerPlants.this, Chrysanthemum.class);
                startActivity(intent);

            }
        });

        DesertRose=findViewById(R.id.DesertRose);
        DesertRose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FlowerPlants.this, Narcissus.class);
                startActivity(intent);

            }
        });

        BougainvilleaPink=findViewById(R.id.BougainvilleaPink);
        BougainvilleaPink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FlowerPlants.this, Dahlia.class);
                startActivity(intent);

            }
        });

        CliviaLily=findViewById(R.id.CliviaLily);
        CliviaLily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FlowerPlants.this, Delphiniums.class);
                startActivity(intent);

            }
        });

        Compacta=findViewById(R.id.Compacta);
        Compacta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FlowerPlants.this, Lilium.class);
                startActivity(intent);

            }
        });

        Kutajah=findViewById(R.id.Kutajah);
        Kutajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FlowerPlants.this, Tulip.class);
                startActivity(intent);

            }
        });


    }
}