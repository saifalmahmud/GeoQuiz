package com.salmahmud.android.geoquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //Referencing by Widgets (True Button)
        mTrueButton = (Button) findViewById(R.id.true_button);
        //Setting On Click Listener (True Button)
        mTrueButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //making Toasts LOL
                Toast.makeText(QuizActivity.this, R.string.incorrect_toast,Toast.LENGTH_SHORT).show();
            }
        });

        //Referencing by Widgets (False Button)
        mFalseButton = (Button) findViewById(R.id.false_button);
        //Setting On Click Listener (False Button)
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Making toasts LOL
                Toast.makeText(QuizActivity.this, R.string.correct_toast,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
