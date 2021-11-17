package com.example.a2product;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView textview = (TextView) findViewById(R.id.topLevel);
    }

    public void View1 (View view)
    {
        Intent intent= new Intent(MainActivity.this,ReceivingOrders.class);
        startActivity(intent);
    }

    public void View2(View view)
    {
        Intent intent= new Intent(MainActivity.this,OrderingOrders.class);
        startActivity(intent);
    }
}