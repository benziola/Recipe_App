package com.example.danielmsibi.recipeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity {
    private static Button bt ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        OnClickButtonListener();
    }

    public  void OnClickButtonListener()
    {
        bt = (Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tent =  new Intent("com.example.danielmsibi.recipeapp.Content");
                startActivity(tent);
            }
        });
    }
}
