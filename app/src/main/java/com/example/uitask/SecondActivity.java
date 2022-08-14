package com.example.uitask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView result, result2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        result = findViewById(R.id.result_id);
        result2 = findViewById(R.id.result_id2);

        Intent intent = getIntent();
        String str1 = intent.getStringExtra("id");
        String str2 = intent.getStringExtra("pw");
        result.setText(str1);
        result2.setText(str2);
    }

}