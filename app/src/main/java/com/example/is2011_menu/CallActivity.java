package com.example.is2011_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CallActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_layout);


    }



    public void main(View view) {
        Intent intent=new Intent();
        intent.setClass(this, MainActivity.class);

        startActivity(intent);
        finish();
    }


}

