package com.netcom.hashmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    EditText name,sub,std,board;
    String stu_name,stu_sub,stu_std,stu_board;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        sub = findViewById(R.id.subjects);
        std = findViewById(R.id.standard);
        board = findViewById(R.id.board);
        btn = findViewById(R.id.submit_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stu_name = name.getText().toString();
                stu_sub = sub.getText().toString();
                stu_std = std.getText().toString();
                stu_board = board.getText().toString();
                HashMap<String, String> school = new HashMap<>();
                school.put("student_name",stu_name);
                school.put("student_subject",stu_sub);
                school.put("student_standard",stu_std);
                school.put("student_board",stu_board);
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("school",school);
                startActivity(i);
                MainActivity.this.finish();
            }
        });
    }
}