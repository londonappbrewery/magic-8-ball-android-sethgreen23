package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set the button
        final Button ask;
        ask=(Button)findViewById(R.id.ask);
        //set the view image of the
        final ImageView ball=(ImageView)findViewById(R.id.decision);
        //set the random valiable
        final Random rand=new Random();
        //set the array holding the image resourses
        final int[] ballArray={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //generate the random number
                int number = rand.nextInt(5);
                ball.setImageResource(ballArray[number]);
            }
        });
    }
}
