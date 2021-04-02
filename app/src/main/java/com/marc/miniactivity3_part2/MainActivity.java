package com.marc.miniactivity3_part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.textrebut);
        third = (Button) findViewById(R.id.button3);

        Intent intent = getIntent();
        String text_compartit = intent.getStringExtra(Intent.EXTRA_TEXT);
        text.setText(text_compartit);

        // To view the third section that is called by the other aplication with ACTION_PICK to pick the text
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });

    }
}