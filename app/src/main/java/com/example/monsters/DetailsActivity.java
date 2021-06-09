package com.example.monsters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView nameView = findViewById(R.id.monster_name);
        ImageView imageView = findViewById(R.id.monster_image);

        String name = getIntent().getExtras().getString("monster_name");
        int imageRes = getIntent().getExtras().getInt("monster_image");

        nameView.setText(name);
        imageView.setImageResource(imageRes);
    }
}