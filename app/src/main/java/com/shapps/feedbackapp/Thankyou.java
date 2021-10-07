package com.shapps.feedbackapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Thankyou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        String name=getIntent().getExtras().getString("name");
        TextView thanks=findViewById(R.id.textView5);
        thanks.setText("                      Hey!\n             "+name+" \n   Thanks for your feedback");


    }

}