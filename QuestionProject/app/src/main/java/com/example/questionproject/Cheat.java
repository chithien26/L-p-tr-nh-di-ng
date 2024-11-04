package com.example.questionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cheat extends AppCompatActivity {

    private Button btnShowAnswer;
    private TextView textCheat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        textCheat = findViewById(R.id.textCheat);
        btnShowAnswer = findViewById(R.id.button_show_answer);
        btnShowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textCheat.setText("Đáp án là: " + getIntent().getStringExtra("answer"));
            }
        });
    }
}