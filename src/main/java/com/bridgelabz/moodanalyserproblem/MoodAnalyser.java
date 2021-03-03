package com.bridgelabz.moodanalyserproblem;

public class MoodAnalyser {

    public String message;

    public MoodAnalyser(String message){

        this.message = message;

    }

    public String analyseMood() {

        try {

           if (message.contains("sad")) {

                 return "SAD";

            } else {

                return "HAPPY";

            }
        }
        catch (NullPointerException e){

            System.out.println("catch block executed");

        }

        return "Exception got Handeled";

    }

}
