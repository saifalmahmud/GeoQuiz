package com.salmahmud.android.geoquiz;

/**
 * Created by saifalmahmud on 9/18/2016.
 */
public class Question {

    // adding two member variables
    private int mTextResId;
    private boolean mAnswerTrue;

    //Constructor of the class Question.
    public Question(int textResId, boolean answerTrue){
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }


    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
