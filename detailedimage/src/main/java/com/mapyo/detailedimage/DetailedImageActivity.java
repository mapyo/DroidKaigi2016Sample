package com.mapyo.detailedimage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class DetailedImageActivity extends AppCompatActivity {

    private static final String INTENT_PREFIX = "com.mapyo.detailedimage.";
    private static final String EXTRA_IMAGE_ID = INTENT_PREFIX + "EXTRA_IMAGE_ID";

    public static void launchActivity(Context context, int resId) {
        Intent intent = new Intent(context, DetailedImageActivity.class);
        intent.putExtra(EXTRA_IMAGE_ID, resId);
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

        int imageResId = getIntent().getIntExtra(EXTRA_IMAGE_ID, -1);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(imageResId);

        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.image_detail_layout);
        frameLayout.addView(imageView);
    }
}
