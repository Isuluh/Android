package com.example.twoactivitieschalange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView secondTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        secondTextView=findViewById(R.id.textViewSecond);
        int textNumber =intent.getIntExtra(MainActivity.EXTRA_MESSAGE,0);
        if(textNumber==1)
        {
            secondTextView.setText(R.string.article_text_one);

        }
        else if(textNumber==2)
        {
           secondTextView.setText(R.string.article_text_two);
        }
        else if(textNumber==3)
        {
           secondTextView.setText(R.string.article_text_three);

        }
        else
        {
            secondTextView.setText(R.string.article_text);
        }

    }
}
