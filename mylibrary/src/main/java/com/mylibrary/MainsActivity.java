package com.mylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainsActivity extends AppCompatActivity {

    private Activity activity;

    public MainsActivity(Activity activity){
            this.activity = activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        message();
    }

    public void message(){
        Toast.makeText(activity, "Dependency trail success", Toast.LENGTH_LONG).show();
    }

}
