package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewSecond;
    private EditText editTextReply;
    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";


    /**
     * Initializes the activity.
     *
     * @param savedInstanceState The current state data
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textViewSecond = findViewById(R.id.textViewSecond);
        editTextReply = findViewById(R.id.editTextSecond);

        // sets the TV with massage from main
        textViewSecond.setText(message);
    }

    /**
     * Handles the onClick for the "Reply" button. Gets the message from the
     * second EditText, creates an intent, and returns that message back to
     * the main activity.
     *
     * @param view The view (Button) that was clicked.
     */

    public void returnReply(View view) {

        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, editTextReply.getText().toString());
        setResult(RESULT_OK, replyIntent);
        finish();


    }
}
