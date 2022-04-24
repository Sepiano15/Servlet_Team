package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Project7_2 extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project7_2);
        setTitle("배경색 바꾸기(컨텍스트 메뉴)");

        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.btn_bg);
        registerForContextMenu(button1);
        button2 = (Button) findViewById(R.id.btn_btn);
        registerForContextMenu(button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mi = getMenuInflater();
        if(v==button1){
            menu.setHeaderTitle("배경색 변경");

            mi.inflate(R.menu.menu1,menu);
        }
        if(v==button2){
            mi.inflate(R.menu.menu2,menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.menuRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.menuGreen:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menuBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate:
                button2.setRotation(45);
                return true;
            case R.id.subSize:
                button2.setScaleX(2);
                return true;
        }
        return false;
    }

}