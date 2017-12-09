package com.example.win8.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button catagory = findViewById(R.id.wallpaper);
            catagory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent newpage = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(newpage);
                }
            });
        }
    }


