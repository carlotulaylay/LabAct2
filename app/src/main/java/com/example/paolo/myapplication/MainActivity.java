package com.example.paolo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button constraint = (Button) findViewById(R.id.constraint);
        constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent moveSecond = new Intent(getApplicationContext(), ConstraintactActivity.class);
                startActivity(moveSecond);
            }
        });


        Button linear = (Button) findViewById(R.id.linear);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent moveSecond = new Intent(getApplicationContext(), LinearactActivity.class);
                startActivity(moveSecond);
            }
        });


        Button activity_main = (Button) findViewById(R.id.relative);
        activity_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent moveSecond = new Intent(getApplicationContext(), RelativeactActivity.class);
                startActivity(moveSecond);
            }
        });
    }

}