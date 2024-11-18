package com.example.questionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class   Cheat extends AppCompatActivity {

    private Button btnShowAnswer;
    private TextView textCheat;
    private List<Interge> cheatedList = new ArrayList<>();
    private static final String EXTRA_ANSWER = "";
    private static final String EXTRA_ANSWER_RESULT = "";
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
                cheatedList.add(getIntent().getIntExtra("currentQuetionId", 5));
            }
        });
    }

    private void setAnswerrResult(Boolean isAnswerShow){
        Intent data = new Intent();
        data.putExtra(EXTRA_ANSWER, isAnswerShow);
        setResult(RESULT_OK, data);
    }

    public static Boolean getAmswerShow(Intent intent){
        return intent.getBooleanExtra(EXTRA_ANSWER_RESULT, false);
    }

}