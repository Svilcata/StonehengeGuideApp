package com.svilcata.stonehengeguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ImageActivity extends AppCompatActivity {

    public void returnToMainActivity(View v) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }
}
