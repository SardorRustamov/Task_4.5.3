package com.example.uitask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText getID, getPW;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show();
    }
    void show(){
        getID = (EditText) findViewById(R.id.enter_id);
        getPW = (EditText) findViewById(R.id.pw_id);
        button = (Button) findViewById(R.id.button_id);

        button.setOnClickListener(view -> {
            String name_ID =getID.getText().toString();
            String name_PW =getPW.getText().toString();
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra("pw", name_PW);
            intent.putExtra("id", name_ID);
            startActivity(intent);

        });
    }
}