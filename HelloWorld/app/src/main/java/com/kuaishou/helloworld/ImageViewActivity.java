package com.kuaishou.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        imageView = findViewById(R.id.imageView_2);

        Glide.with(this).load("https://pics1.baidu.com/feed/42166d224f4a20a4304a97477ca9a225700ed0d9.jpeg?token=e9c2b2039468a91b2390cdbab04884d8").into(imageView);



    }
}