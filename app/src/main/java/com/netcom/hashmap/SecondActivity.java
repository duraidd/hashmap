package com.netcom.hashmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;

public class SecondActivity extends AppCompatActivity {
    TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1 = findViewById(R.id.name_textview);
        Intent intent = getIntent();
        HashMap<String, String> hashMap = (HashMap<String, String>)intent.getSerializableExtra("school");
        String a = hashMap.get("student_name");
        txt1.setText(a);

    }
}