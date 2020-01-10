package com.example.twoactivitieschalange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Bu uygulama 3 buton ve iki activityden olusmakatadır.
 * Butonlardan herhangi birine basıldıgında 2.Activity de scrollview
 * üzerinde açılan textin hangisi olucagına karar verir.
 *
 *
 */

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    Intent intent ;

    public static final String EXTRA_MESSAGE
            = "com.example.android.twoactivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, SecondActivity.class);
    }

    public void textOneOnclick(View view) {
        Log.d(LOG_TAG,"Button 1 Clicked!");
        intent.putExtra(EXTRA_MESSAGE,1);
        startActivity(intent);

    }

    public void textTwoOnclick(View view) {
        Log.d(LOG_TAG,"Button 2 Clicked!");
        intent.putExtra(EXTRA_MESSAGE,2);
        startActivity(intent);
    }

    public void textThreeOnclick(View view) {
        Log.d(LOG_TAG,"Button 3 Clicked!");
        intent.putExtra(EXTRA_MESSAGE,3);
        startActivity(intent);

    }
}
