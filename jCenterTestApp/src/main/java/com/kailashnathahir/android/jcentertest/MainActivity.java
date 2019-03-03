package com.kailashnathahir.android.jcentertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.kailashnathahir.android.jcentertestlibrary.Util;

public class MainActivity extends AppCompatActivity {

    TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = findViewById(R.id.main_text);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mainText.setText(Util.getHelloWorld());
    }

    @Override
    protected void onPause() {
        super.onPause();

        mainText.setText("");
    }
}
