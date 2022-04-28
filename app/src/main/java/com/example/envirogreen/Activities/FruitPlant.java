package com.example.envirogreen.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.envirogreen.FruitPlant.Apricot;
import com.example.envirogreen.FruitPlant.Blueberry;
import com.example.envirogreen.FruitPlant.Cantaloupe;
import com.example.envirogreen.FruitPlant.FigFruit;
import com.example.envirogreen.FruitPlant.PassifloraEdulis;
import com.example.envirogreen.FruitPlant.PrunusAvium;
import com.example.envirogreen.R;

public class FruitPlant extends AppCompatActivity {

    CardView banana,custardapple,dragon,guava,jamunplant,mango;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit_plant);

        banana=findViewById(R.id.banana);
        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FruitPlant.this, Apricot.class);
                startActivity(intent);

            }
        });

        custardapple=findViewById(R.id.custardapple);
        custardapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FruitPlant.this, Blueberry.class);
                startActivity(intent);

            }
        });

        dragon=findViewById(R.id.dragon);
        dragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FruitPlant.this, Cantaloupe.class);
                startActivity(intent);

            }
        });

        guava=findViewById(R.id.guava);
        guava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FruitPlant.this, FigFruit.class);
                startActivity(intent);

            }
        });

        jamunplant=findViewById(R.id.jamunplant);
        jamunplant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FruitPlant.this, PassifloraEdulis.class);
                startActivity(intent);

            }
        });

        mango=findViewById(R.id.mango);
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(FruitPlant.this, PrunusAvium.class);
                startActivity(intent);

            }
        });


    }
}