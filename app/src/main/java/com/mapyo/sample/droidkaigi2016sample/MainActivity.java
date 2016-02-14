package com.mapyo.sample.droidkaigi2016sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mainImage = (ImageView) findViewById(R.id.main_image);

        final String imageUrl = "https://raw.githubusercontent.com/mapyo/sample/master/image/nyannyan.png";
        Picasso.with(this).load(imageUrl).into(mainImage);

        mainImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailedImageActivity.launchActivity(MainActivity.this, imageUrl);
            }
        });
    }
}
