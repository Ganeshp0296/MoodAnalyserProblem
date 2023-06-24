package com.bl.moodAnalyser;

import java.util.Locale;

public class MoodAnalyser {
    public  static String analyseMood(String message) {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            }
            return "Happy";
        }
        catch (NullPointerException e){
            return "Happy";
        }
    }
}
