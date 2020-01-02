package com.example.dicerollerapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button resetButton;
    int randomNumber;
    String textViewS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.show_count);
        Toast.makeText(MainActivity.this, "ON CREATE !! ", Toast.LENGTH_SHORT).show();


    }

    public void countUp(View view) {
        if (textView.getText().toString().equals("A")) {

            textView.setText("" + 1);
            return;

        } else {

            int rollerInt = Integer.parseInt(textView.getText().toString());

            if (rollerInt < 6) {
                rollerInt++;
                textView.setText("" + rollerInt);

            }
        }
    }

    public void showToast(View view) {
        Toast.makeText(MainActivity.this, "Merhaba", Toast.LENGTH_SHORT).show();

        randomNumber = new Random().nextInt(6) + 1;
        textView.setText("" + randomNumber);
    }

    public void setZero(View view) {
        textView.setText(""+"0");
    }
}
