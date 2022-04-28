package com.example.envirogreen.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.envirogreen.Fertiliser.CompleteFertilizer;
import com.example.envirogreen.Fertiliser.CompoundFertilizers;
import com.example.envirogreen.Fertiliser.NitrogenFertilizers;
import com.example.envirogreen.Fertiliser.PhosphateFertilizers;
import com.example.envirogreen.Fertiliser.PotassiumFertilizers;
import com.example.envirogreen.R;

public class Fertiliser extends AppCompatActivity {

    CardView NitrogenFertilizers,PhosphateFertilizers,PotassiumFertilizers,CompoundFertilizers,CompleteFertilizer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertiliser);

        NitrogenFertilizers=findViewById(R.id.NitrogenFertilizers);
        NitrogenFertilizers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Fertiliser.this, NitrogenFertilizers.class);
                startActivity(intent);

            }
        });

        PhosphateFertilizers=findViewById(R.id.PhosphateFertilizers);
        PhosphateFertilizers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Fertiliser.this, PhosphateFertilizers.class);
                startActivity(intent);

            }
        });

        PotassiumFertilizers=findViewById(R.id.PotassiumFertilizers);
        PotassiumFertilizers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Fertiliser.this, PotassiumFertilizers.class);
                startActivity(intent);

            }
        });

        CompoundFertilizers=findViewById(R.id.CompoundFertilizers);
        CompoundFertilizers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Fertiliser.this, CompoundFertilizers.class);
                startActivity(intent);

            }
        });

        CompleteFertilizer=findViewById(R.id.CompleteFertilizer);
        CompleteFertilizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Fertiliser.this, CompleteFertilizer.class);
                startActivity(intent);

            }
        });



    }
}