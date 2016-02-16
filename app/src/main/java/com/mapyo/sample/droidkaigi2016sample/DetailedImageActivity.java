package com.mapyo.sample.droidkaigi2016sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DetailedImageActivity extends AppCompatActivity {

    private static final String INTENT_PREFIX = "com.mapyo.detailedimage.";
    private static final String EXTRA_IMAGE_URL = INTENT_PREFIX + "EXTRA_IMAGE_URL";

    public static void launchActivity(Context context, String imageUrl) {
        Intent intent = new Intent(context, DetailedImageActivity.class);
        intent.putExtra(EXTRA_IMAGE_URL, imageUrl);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_detailed_image);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_IMAGE_URL);

        ImageView imageView = new ImageView(this);
        Picasso.with(this).load(imageUrl).into(imageView);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.image_detail_layout);
        frameLayout.addView(imageView);
    }
}
