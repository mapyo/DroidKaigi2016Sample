package com.mapyo.sample.droidkaigi2016sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    static final int imageResId = R.drawable.nyannyan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mainImage = (ImageView) findViewById(R.id.main_image);
        mainImage.setImageResource(imageResId);

        mainImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailedImageActivity.launchActivity(MainActivity.this, imageResId);
            }
        });
    }
}
