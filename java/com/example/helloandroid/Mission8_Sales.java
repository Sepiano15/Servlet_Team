package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mission8_Sales extends AppCompatActivity {


    Button smenuButton;
    Button sloginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission8_sales);

        smenuButton = findViewById(R.id.smenuButton);
        sloginButton = findViewById(R.id.sloginButton);

        smenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission8_Menu.class);
                startActivity(intent);
                finish();
            }
        });

        sloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission8_Login.class);
                startActivity(intent);
                finish();
            }
        });
    }
}