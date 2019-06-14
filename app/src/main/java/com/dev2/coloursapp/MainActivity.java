package com.dev2.coloursapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.button1) Button btnWhite;
    @BindView(R.id.button2) Button btnBlack;
    @BindView(R.id.button3) Button btnBlue;
    @BindView(R.id.button4) Button btnRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.button1)
    private void click1(){
        Intent i = new Intent(getApplicationContext(),ColorActivity.class);
        i.putExtra("color",1);
        startActivity(i);
    }

    @OnClick(R.id.button1)
    private void click2(){
        Intent i = new Intent(getApplicationContext(),ColorActivity.class);
        i.putExtra("color",2);
        startActivity(i);
    }

}
