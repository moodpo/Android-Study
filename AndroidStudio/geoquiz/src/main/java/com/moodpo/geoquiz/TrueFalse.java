package com.moodpo.geoquiz;

/**
 * Created by xiaoxie on 2014/11/24.
 */
public class TrueFalse {

    private int mQuestion;

    private boolean mTrueQuestion;

    public TrueFalse (int mQuestion, boolean mTrueQuestion){
        this.mQuestion = mQuestion;
        this.mTrueQuestion = mTrueQuestion;
    }

    public boolean ismTrueQuestion() {
        return mTrueQuestion;
    }

    public void setmTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }

    public int getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }


}
