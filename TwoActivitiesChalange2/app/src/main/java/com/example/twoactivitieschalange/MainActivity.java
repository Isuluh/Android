package com.example.twoactivitieschalange;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    private TextView mTexViev1;
    private TextView mTexViev2;
    private TextView mTexViev3;
    private TextView mTexViev4;




    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(mTexViev1.getVisibility() == View.VISIBLE){
            outState.putBoolean("state_visible",true);
            outState.putString("state_text",mTexViev1.getText().toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTexViev1 = findViewById(R.id.mtv1);
        mTexViev2 = findViewById(R.id.mtv2);
        mTexViev3 = findViewById(R.id.mtv3);
        mTexViev4 = findViewById(R.id.mtv4);


        if(savedInstanceState !=null)
        {

            Toast.makeText(this,"STATE boş degil !!",Toast.LENGTH_SHORT).show();
            boolean isVisible =savedInstanceState.getBoolean("state_visible");
            if(isVisible) {
                mTexViev1.setVisibility(View.VISIBLE);
                mTexViev1.setText(savedInstanceState.getString("state_text"));
            }

        }


    }

    public void slectShoppingElements(View view) {
        Toast.makeText(this, "Youy gonna make List", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, SecondaryActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == TEXT_REQUEST) {
            // Test to make sure the intent reply result was good.
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondaryActivity.EXTRA_REPLY);


                if (reply.equals("Cheese")) {
                    mTexViev1.setText(reply);
                    mTexViev1.setVisibility(View.VISIBLE);
                } else if (reply.equals("Rice")) {
                    mTexViev2.setText(reply);
                    mTexViev2.setVisibility(View.VISIBLE);

                }
                else if (reply.equals("Apple")) {
                    mTexViev3.setText(reply);
                    mTexViev3.setVisibility(View.VISIBLE);

                }
                else if (reply.equals("Bread")) {
                    mTexViev4.setText(reply);
                    mTexViev4.setVisibility(View.VISIBLE);

                }
                else
                {
                    Toast.makeText(this,"Wrong Repply",Toast.LENGTH_SHORT).show();
                }

            }
        }


    }
}
