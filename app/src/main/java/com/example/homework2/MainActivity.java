package com.example.homework2;

import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 *  Main Activity: finds the elements from activity_main.xml
 *  and creates listeners for them in GameSurfaceView.java
 *
 * @author Cory Marleau
 * @version September 26 2021
 *
 *  Enhancements: This project has +/- buttons that can change
 *  the size of the board. It can be reduced from a 3x3 board or
 *  increased to a 9x9.
 *
 *  The size of the tiles changes based on the screen size, and will resize
 *  to take up as much space as possible. The tiles are drawn with a surfaceView
 *  instead of using buttons
 *
 *  Bugs: Small paint error upon resizing the board. Some tiles that are
 *  in their correct position do not change color. However it is immediately
 *  resolved when the board is tapped. Not game breaking. Very minimal.
 *
 *  No other known bugs.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 1: Find the object of elements to interact
        GameSurfaceView gameSurfaceView = (GameSurfaceView) findViewById(R.id.gameSurfaceView);

        View increaseSizeButton = (View) findViewById(R.id.sizeUpButton);
        View decreaseSizeButton = (View) findViewById(R.id.sizeDownButton);
        View shuffleButton = (View) findViewById(R.id.shuffleButton);

        //Step 2: Set up listeners for the objects
        gameSurfaceView.setOnTouchListener(gameSurfaceView);
        increaseSizeButton.setOnClickListener(gameSurfaceView);
        decreaseSizeButton.setOnClickListener(gameSurfaceView);
        shuffleButton.setOnClickListener(gameSurfaceView);
    }
}