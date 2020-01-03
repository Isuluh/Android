package com.example.textandscrolling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button addCommentButton;
    private TextView articleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCommentButton = (Button) findViewById(R.id.comment_button);
        articleText = findViewById(R.id.articleText);
        addCommentButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        articleText.append(" merhaba!!");
    }
}
