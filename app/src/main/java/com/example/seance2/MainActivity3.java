package com.example.seance2;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        logo = findViewById(R.id.logo);

        Thread t  =  new Thread(){
            @Override
            public void run() {
                try {
                    RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    rotate.setDuration(5000);
                    rotate.setInterpolator(new LinearInterpolator());
                    logo.setAnimation(rotate);
                    Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                    sleep(5000);
                    startActivity(intent);
                } catch (Exception e) {
                }
            }
        };
        t.start();

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}