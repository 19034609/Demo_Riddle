package sg.edu.rp.c346.id19034609.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Log.d("AnswerActivity", "onCreate() called.");

        tvAnswer = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        String answerSelected = intentReceived.getStringExtra("Answer");
        tvAnswer.setText(questionsSelected + " answer is: " + answerSelected);
    }

    @Override
    protected void onStart() {
        Log.d("AnswerActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity", "onRestart() called.");
        super.onRestart();
    }
}
