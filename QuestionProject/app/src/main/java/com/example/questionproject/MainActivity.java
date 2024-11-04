package com.example.questionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnTrue;
    private Button btnFalse;
    private ImageButton btnNext;
    private ImageButton btnPrevious;
    private Button btncheat;

    private TextView questionView;
    private int currentQuetionId = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Question q1 = new Question(0,getString(R.string.question_1), true);
        Question q2 = new Question(1,getString(R.string.question_2), false);
        Question q3 = new Question(2,getString(R.string.question_3), false);
        Question q4 = new Question(3,getString(R.string.question_4), false);
        Question q5 = new Question(4,getString(R.string.question_5), false);
        Question q6 = new Question(5,getString(R.string.question_6), false);

        Question[] listQuestion = {q1,q2,q3,q4, q5, q6};

        questionView = findViewById(R.id.text_view_question);
        questionView.setText(listQuestion[currentQuetionId].getQuestion());

        btnTrue = findViewById(R.id.button_true);
        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listQuestion[currentQuetionId].getAnswer() == true) {
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
            }
        });

        btnFalse = findViewById(R.id.button_false);
        btnFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listQuestion[currentQuetionId].getAnswer() == false) {
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_SHORT).show();
            }
        });

        btnNext = findViewById(R.id.button_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentQuetionId += 1;
                if (currentQuetionId < listQuestion.length){
                    questionView.setText(listQuestion[currentQuetionId].getQuestion());
                }
                else {
                    currentQuetionId = listQuestion.length - 1;
                    Toast.makeText(MainActivity.this, "da het cau hoi", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnPrevious = findViewById(R.id.button_previous);
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentQuetionId -= 1;
                if (currentQuetionId >= 0){
                    questionView.setText(listQuestion[currentQuetionId].getQuestion());
                }
                else {
                    currentQuetionId = 0;
                    Toast.makeText(MainActivity.this, "dau tien", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncheat = findViewById(R.id.button_cheat);
        btncheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Cheat.class);
                intent.putExtra("answer",listQuestion[currentQuetionId].getAnswer().toString());
                startActivity(intent);
            }
        });


    }
}