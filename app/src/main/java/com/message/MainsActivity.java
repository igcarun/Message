package com.message;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message();
    }

    public void message(){
        Toast.makeText(MainsActivity.this, "Dependency trail success", Toast.LENGTH_LONG).show();
    }

}
