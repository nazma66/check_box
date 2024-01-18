package com.example.check_box;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox,checkBox2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        checkBox = findViewById(R.id.checkBox);
        checkBox2 =findViewById(R.id.checkBox2);
        button = findViewById(R.id.button);


      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this, SecondActivity.class);
              if(checkBox.isChecked()){
                  String result = "Right Answer";
                  intent.putExtra("grade1",result);

              }


              if(checkBox2.isChecked()){
                  String result2 = "Wrong Answer";
                  intent.putExtra("grade2",result2);
              }
              startActivity(intent);
          }
      });


    }
}