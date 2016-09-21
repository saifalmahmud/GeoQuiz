package com.salmahmud.android.geoquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mQuestionTextView;

    // Question Array
    private Question[] mQuestionBank = new Question[]{
            new Question(R.string.question_ocean, true),
            new Question(R.string.question_mideast, false),
            new Question(R.string.question_africa, false),
            new Question(R.string.question_americas, true),
            new Question(R.string.question_asia, true),
    };

    // Setting currentIndex to zero.
    private int mCurrentIndex = 0;

    private void updateQuestion(){
        int question = mQuestionBank[mCurrentIndex].getTextResId();
        mQuestionTextView.setText(question);
    }

    private void checkAnswer(boolean userPressedTrue){
        boolean answerIsTrue = mQuestionBank[mCurrentIndex].isAnswerTrue();

        int messageResId = 0;

        if(userPressedTrue == answerIsTrue){
            messageResId = R.string.correct_toast;
        }else{
            messageResId = R.string.incorrect_toast;
        }

        Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        // Getting a reference for the TextView and setting its text to the questions at current index
        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);



        // Referencing by Widgets (True Button)
        mTrueButton = (Button) findViewById(R.id.true_button);
        // Setting On Click Listener (True Button)
        mTrueButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // making Toasts LOL
                checkAnswer(true);
            }
        });


        // Referencing by Widgets (False Button)
        mFalseButton = (Button) findViewById(R.id.false_button);
        //Setting On Click Listener (False Button)
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //Making toasts LOL
                checkAnswer(false);
            }
        });

        // Referencing by Widgets (Next Button)
        mNextButton = (Button) findViewById(R.id.next_button);
        // Setting On click Listener (Next Button)
        mNextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mCurrentIndex = (mCurrentIndex+1)% mQuestionBank.length;
                updateQuestion();
            }
        });

        // Updating the question
        updateQuestion();

    }
}
