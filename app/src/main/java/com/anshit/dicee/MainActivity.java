package com.anshit.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        Button rollbtn = findViewById(R.id.rollbtn);
        final ImageView dice_left = findViewById(R.id.dice_left);
        final ImageView dice_right = findViewById(R.id.dice_right);
        rollbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int r = rand.nextInt(6);
                dice_left.setImageResource(diceArray[r]);
                r = rand.nextInt(6);
                dice_right.setImageResource((diceArray[r]));
            }
        });

    }
}
