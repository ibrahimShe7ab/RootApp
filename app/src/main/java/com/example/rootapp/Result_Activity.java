package com.example.rootapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Result_Activity extends AppCompatActivity {
ImageView imageView;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_result);
         imageView=findViewById(R.id.result_img);
         textView=findViewById(R.id.result_textView);
        Intent intent=getIntent();
        String content=intent.getStringExtra("course");
        textView.setText(content);



        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int imageResourceId = bundle.getInt("img", -1); // Default value -1 if not found
            if (imageResourceId != -1) {
                imageView.setImageResource(imageResourceId);
            }
        }

    }
}