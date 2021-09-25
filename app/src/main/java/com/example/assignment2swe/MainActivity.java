package com.example.assignment2swe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editTextName;
Button btn;
TextView textName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName=(EditText) findViewById(R.id.editTextName);
        btn=(Button) findViewById(R.id.btn);
        textName=(TextView) findViewById(R.id.textName);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= editTextName.getText().toString();
                textName.setText("Hi " + name);
            }
        });
    }
}