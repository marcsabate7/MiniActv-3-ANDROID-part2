package com.marc.miniactivity3_part2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private Button musica;
    private static final int REQUEST_EXTERNAL_STORAGE = 100;
    private static final int REQUEST_MUSIC = 101;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        musica = (Button) findViewById(R.id.buttonmusica);
        text = findViewById(R.id.Textpicker);

        // When button is cliked we return the text of the TextView and we finished the intent, the other aplication catch the text
        musica.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String missatge = text.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("messageReturn",missatge);
                setResult(RESULT_OK,intent);
                finish();
            }
        });


    }

}







