package com.bl.moodAnalyserTest;

import com.bl.moodAnalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTester {
    MoodAnalyser mood = new MoodAnalyser();

    @Test
    public void WhenGivenMessageIsSadThenReturnsad(){
        String actualResult = mood.analyseMood("i am in sad mood");
        Assertions.assertEquals("Sad",actualResult);
    }
    @Test
    public void WhenGivenMessageIsAnyThenReturnHappy(){
        String actualResult = mood.analyseMood("I am in any mood");
        Assertions.assertEquals("Happy",actualResult);
    }
    @Test
    public void WhenGivenMessageIsNullThenHandleException(){
        String actualResult = mood.analyseMood(" ");
        Assertions.assertEquals("Happy",actualResult);
    }
}
