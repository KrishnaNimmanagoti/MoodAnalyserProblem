package com.bridgelabz.moodanalyserproblem;

public class MoodAnalyser {

    enum ExceptionType {

        NULL, EMPTY;

    }

    public String message;

    public MoodAnalyser(String message) {

        this.message = message;

    }

    public String analyseMood() throws MoodAnalyserException {

        try {

            if(message == null | message == ""){

                throw new MoodAnalyserException("Invalid mood");

            }
            else if (ExceptionType.EMPTY.equals(ExceptionType.valueOf(message))){

                throw new MoodAnalyserException(ExceptionType.EMPTY + " MOOD");

            }

            else if (ExceptionType.NULL.equals(ExceptionType.valueOf(message))) {

                throw new MoodAnalyserException(ExceptionType.NULL + " MOOD");

            }

            return message.contains("sad") ? "SAD" : "HAPPY";

        }
        catch (MoodAnalyserException e) {

            System.out.println(e);

            return "Exception Handled";

        }

    }


}
