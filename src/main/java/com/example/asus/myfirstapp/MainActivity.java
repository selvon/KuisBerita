package com.example.asus.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void NewsO (View view ){
        Intent intent = new Intent(this, BeritaSatu.class);

        startActivity(intent);
    }

     public void NewsT (View view ){
        Intent intent = new Intent(this, BeritaDua.class);

        startActivity(intent);
    }

    public void NewsTh (View view ){
        Intent intent = new Intent(this, BeritaTiga.class);

        startActivity(intent);
    }
}
