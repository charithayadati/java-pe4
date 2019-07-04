package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurencesOfWordTest {

    MultipleOccurencesOfWord multipleOccurencesOfWord;

    @Before
    public void setUp(){
        System.out.println(" Before");
        multipleOccurencesOfWord= new MultipleOccurencesOfWord();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        multipleOccurencesOfWord=null;
    }
    @Test
    public void givenStringShouldReturnNumberOfOccurances(){
        String result=multipleOccurencesOfWord.findOccurance("She sells seashells by the seashore" , "se");
        assertEquals("Found at: 4 - 6 Found at: 10 - 12 Found at: 27 - 29",result);
    }
    @Test
    public void givenStringShouldReturnOccurances(){
        String result=multipleOccurencesOfWord.findOccurance("This is Henry" , null);
        assertEquals(null,result);
    }
    @Test
    public void givenStringShouldReturnNull(){
        String result=multipleOccurencesOfWord.findOccurance(null, null);
        assertNull("passed",result);
    }




}