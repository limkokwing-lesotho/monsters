package com.example.monsters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton m1 = findViewById(R.id.monster01);
        ImageButton m2 = findViewById(R.id.monster02);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("monster_image", R.drawable.monster_1);
                intent.putExtra("monster_name", "Sebolelo Nthethe");
                startActivity(intent);
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("monster_image", R.drawable.monster_2);
                intent.putExtra("monster_name", "Thabo Lebese");
                startActivity(intent);
            }
        });
    }
}