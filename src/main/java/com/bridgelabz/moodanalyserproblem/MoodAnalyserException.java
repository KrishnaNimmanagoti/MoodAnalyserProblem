package com.bridgelabz.moodanalyserproblem;

public class MoodAnalyserException extends Exception{

    enum ExceptionType{

        ENTERED_NULL, ENTERED_EMPTY

    }

    public MoodAnalyserException(String s){

        super(s);

    }

}
