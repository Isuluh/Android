package com.example.inputcontrolshw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private CheckBox ch1, ch2, ch3, ch4;
    private  String toastMessage ="Toppings : ";
    private  boolean ch1b,ch2b,ch3b,ch4b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        ch4 = findViewById(R.id.ch4);


         ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(isChecked)
               {
                   ch1b=true;
               }
               else {
                   ch1b=false;

               }
             }
         });
         ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 if(isChecked)
                 {
                     ch2b =true;
                 }
                 else{
                     ch2b =false;
                 }


             }
         });
         ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 if(isChecked)
                 {
                     ch3b=true;
                 }
                 else
                 {
                     ch3b =false;
                 }
             }
         });
        ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    ch4b=true;
                }
                else
                {
                    ch4b=false;
                }


            }
        });



    }

    public void showToast(View view) {


        if(ch1b){
            toastMessage +=" "+ch1.getText().toString();
        }
        if(ch2b){
            toastMessage +=" "+ ch2.getText().toString();
        }
        if(ch3b){
            toastMessage += " "+ch3.getText().toString();
        }
        if(ch4b){
            toastMessage +=" "+ch4.getText().toString();
        }


        Toast.makeText(this,toastMessage,Toast.LENGTH_SHORT).show();
        toastMessage="";



    }
}
