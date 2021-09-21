package com.example.homework2;

import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 1: Find the object of elements to interact
        GameSurfaceView gameSurfaceView = (GameSurfaceView) findViewById(R.id.gameSurfaceView);

        //Step 2: Set up listeners for the objects
        gameSurfaceView.setOnTouchListener(gameSurfaceView);
    }
}