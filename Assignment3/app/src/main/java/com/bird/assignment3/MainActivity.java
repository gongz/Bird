package com.bird.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bird.assignment3.Test.ChessPieceTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ChessPieceTest.runTest();
    }
}
