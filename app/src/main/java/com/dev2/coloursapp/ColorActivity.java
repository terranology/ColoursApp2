package com.dev2.coloursapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ColorActivity extends AppCompatActivity {

    RelativeLayout relContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        relContainer = findViewById(R.id.container);

        int colorRecuperado = getIntent().getIntExtra("color", 0);

        switch (colorRecuperado) {
            case 1:
                relContainer.setBackgroundColor(Color.WHITE);
                break;
            case 2:
                relContainer.setBackgroundColor(Color.BLACK);
                break;
            case 3:
                relContainer.setBackgroundColor(Color.BLUE);
                break;
            case 4:
                relContainer.setBackgroundColor(Color.RED);
                break;
            default:
        }
    }
}
