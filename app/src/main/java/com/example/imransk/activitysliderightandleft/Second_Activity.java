package com.example.imransk.activitysliderightandleft;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void openActivity3(View view) {
        startActivity(new Intent(Second_Activity.this,Thired_Activity.class));

    }
}
