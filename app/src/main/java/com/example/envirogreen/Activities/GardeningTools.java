package com.example.envirogreen.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;

import com.example.envirogreen.GardeningToolls.HandTrowel;
import com.example.envirogreen.GardeningToolls.Rake;
import com.example.envirogreen.GardeningToolls.Spad;
import com.example.envirogreen.GardeningToolls.WaterHose;
import com.example.envirogreen.GardeningToolls.Wheelbarrow;
import com.example.envirogreen.R;

public class GardeningTools extends AppCompatActivity {

    CardView HandTrowel,Rake,Spad,Loppers,Wheelbarrow,WaterHose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gardening_tools);

        HandTrowel=findViewById(R.id.HandTrowel);
        HandTrowel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GardeningTools.this, HandTrowel.class);
                startActivity(intent);

            }
        });

        Rake=findViewById(R.id.Rake);
        Rake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GardeningTools.this, Rake.class);
                startActivity(intent);

            }
        });

        Spad=findViewById(R.id.Spad);
        Spad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GardeningTools.this, Spad.class);
                startActivity(intent);

            }
        });

        Loppers=findViewById(R.id.Loppers);
        Loppers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GardeningTools.this, Looper.class);
                startActivity(intent);

            }
        });

        Wheelbarrow=findViewById(R.id.Wheelbarrow);
        Wheelbarrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GardeningTools.this, Wheelbarrow.class);
                startActivity(intent);

            }
        });

        WaterHose=findViewById(R.id.WaterHose);
        WaterHose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GardeningTools.this, WaterHose.class);
                startActivity(intent);

            }
        });

    }
}