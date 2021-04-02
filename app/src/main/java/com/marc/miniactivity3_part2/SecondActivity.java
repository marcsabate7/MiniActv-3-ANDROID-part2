package com.marc.miniactivity3_part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView text = findViewById(R.id.urlField);
        
        String url = null;

        Intent intent = getIntent();
        Uri intentUri = intent.getData();
        String stringUri = intentUri.toString();

        text.setText(stringUri);

    }
}