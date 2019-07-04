package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindAWordInStringTest {

    FindAWordInString findAWordInString;
    @Before
    public void setUp(){
        System.out.println(" Before");
        findAWordInString= new FindAWordInString();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        findAWordInString=null;
    }
    @Test
    public void givenStringShouldReturnTrue(){
        String result=findAWordInString.findTheWord("This is Harry");
        assertEquals("Harry is here",result);
    }
    @Test
    public void givenStringShouldReturnFalse(){
        String result=findAWordInString.findTheWord("This is Henry");
        assertEquals("Harry is not here",result);
    }
    @Test
    public void givenStringShouldReturnNull(){
        String result=findAWordInString.findTheWord(null);
        assertNull("passed",result);
    }



}