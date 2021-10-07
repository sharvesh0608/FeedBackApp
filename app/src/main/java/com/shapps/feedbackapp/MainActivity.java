package com.shapps.feedbackapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void thanks(View view){
        EditText name= findViewById(R.id.editTextTextPersonName3);
        Intent intent= new Intent(this,Thankyou.class);
        intent.putExtra("name",name.getText().toString());
        startActivity(intent);
    }
}