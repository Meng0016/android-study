package com.example.mytoolbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =  findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.e("TAG", "onClick: toolbar被点击了" );
            }
        });

        Toolbar toolbar1 = findViewById(R.id.toolbar1);
        toolbar1.setNavigationIcon(R.drawable.ic_baseline_add_a_photo_24);
        toolbar1.setTitle("标题");
        toolbar1.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.e("TAG", "onClick: toolbar1被点击了" );
            }
        });
    }
}