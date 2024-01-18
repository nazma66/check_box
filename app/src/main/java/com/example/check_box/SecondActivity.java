package com.example.check_box;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

        String value1 = getIntent().getExtras().getString("grade1");
        et1.setText(value1);


        String value2 = getIntent().getExtras().getString("grade2");
        et2.setText(value2);
    }
}