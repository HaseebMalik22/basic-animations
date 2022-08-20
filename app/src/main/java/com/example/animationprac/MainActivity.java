package com.example.animationprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtanim1;
    Button translate1,alpha1,rotate1,scale1;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtanim1 = findViewById(R.id.txtanim);

        translate1 = findViewById(R.id.translate);
        alpha1 = findViewById(R.id.alpha);
        rotate1 = findViewById(R.id.rotate);
        scale1 = findViewById(R.id.scale);





        translate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                txtanim1.startAnimation(move);

            }
        });

        alpha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                txtanim1.startAnimation(alpha);

            }
        });

        scale1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                txtanim1.startAnimation(scale);
            }
        });

        rotate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                txtanim1.startAnimation(rotate);
            }
        });


    }
}