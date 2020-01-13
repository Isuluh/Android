package com.example.twoactivitieschalange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondaryActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";
    Intent replyIntent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }

    public void selectCheese(View view) {


        replyIntent.putExtra(EXTRA_REPLY, "Cheese");
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectRice(View view) {
        replyIntent.putExtra(EXTRA_REPLY, "Rice");
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectApple(View view) {
        replyIntent.putExtra(EXTRA_REPLY, "Apple");
        setResult(RESULT_OK, replyIntent);
        finish();
    }

    public void selectBread(View view) {
        replyIntent.putExtra(EXTRA_REPLY, "Bread");
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
