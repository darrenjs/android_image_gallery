package com.darren.smith.videoplayer.presentation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.darren.smith.videoplayer.R;

/**
 * Host for your screens.
 * All screens should be inherited from Fragments.
 * Use navigation library (https://developer.android.com/guide/navigation) for navigation between screens
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}