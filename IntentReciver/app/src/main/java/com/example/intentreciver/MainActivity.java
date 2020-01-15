package com.example.intentreciver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.uri_text_view);

        Intent intent = getIntent();

        if (intent.getAction() == Intent.ACTION_VIEW) {
            Uri uri = intent.getData();
            if (uri != null) {
                String uri_string = getString(R.string.uri_label)
                        + uri.toString();

                textView.setText(uri_string);
            }
        }
        else if (intent.getAction() == Intent.ACTION_SEND){

            String uri_string = getString(R.string.uri_label)
                    + intent.getStringExtra(Intent.EXTRA_TEXT);

            textView.setText(uri_string);

        }
        else {
            textView.setText("DEFAULT !! ");


        }
    }
}
