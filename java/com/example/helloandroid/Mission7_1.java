package com.example.helloandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mission7_1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission7_1);

        Button loginButton = findViewById(R.id.button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mission7_2.class);
                startActivityForResult(intent,101);
            } // 인텐트에 메뉴액티비티 넣어서 호출
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 101){
            if(data!=null){
                String name = data.getStringExtra("name");

                Toast toast = Toast.makeText(getBaseContext(),"result code : " + resultCode + ", " + name,Toast.LENGTH_LONG);
                toast.show();

            }
        }
    }
}