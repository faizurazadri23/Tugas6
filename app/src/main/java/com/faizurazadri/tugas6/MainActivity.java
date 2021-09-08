package com.faizurazadri.tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.faizurazadri.tugas6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
    }
}