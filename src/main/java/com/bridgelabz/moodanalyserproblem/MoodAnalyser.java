package com.bridgelabz.moodanalyserproblem;

public class MoodAnalyser {

    public String message;

    public MoodAnalyser(String message) {

        this.message = message;

    }

    public String analyseMood() throws MoodAnalyserException {

        try {

            if(message == (null)){

                throw new MoodAnalyserException("Invalid mood");

            }
            else if(message == ""){

                throw new MoodAnalyserException("Invalid mood");

            }

            return message.contains("sad") ? "SAD" : "HAPPY";

        }
        catch (MoodAnalyserException e) {

            return "Exception got handled";

        }

    }


}
