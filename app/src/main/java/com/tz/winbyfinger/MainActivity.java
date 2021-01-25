package com.tz.winbyfinger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    View viewPlayerOne,viewPlayerTwo;
    int height,width;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        viewPlayerOne = findViewById(R.id.player_one);
        viewPlayerTwo = findViewById(R.id.player_two);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        height = displayMetrics.heightPixels;
        width = displayMetrics.widthPixels;



        startGame();

        viewPlayerOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                viewPlayerOne.setLayoutParams(new LinearLayout.LayoutParams(width, viewPlayerOne.getHeight()+10));
                viewPlayerTwo.setLayoutParams(new LinearLayout.LayoutParams(width, viewPlayerTwo.getHeight()-10));

            }
        });

        viewPlayerTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPlayerTwo.setLayoutParams(new LinearLayout.LayoutParams(width, viewPlayerTwo.getHeight()+10));
                viewPlayerOne.setLayoutParams(new LinearLayout.LayoutParams(width, viewPlayerOne.getHeight()-10));
            }
        });




    }

    private void startGame() {
//        viewPlayerOne.setLayoutParams(new LinearLayout.LayoutParams(width, height/2));
//        viewPlayerTwo.setLayoutParams(new LinearLayout.LayoutParams(width, height/2));
    }
}
