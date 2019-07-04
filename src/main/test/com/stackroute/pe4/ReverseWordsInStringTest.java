package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInStringTest {
    ReverseWordsInString reverseWordsInString;
    @Before
    public void setUp(){
        System.out.println(" Before");
        reverseWordsInString= new ReverseWordsInString();
    }
    @After
    public void tearDown(){
        System.out.println("After");
       reverseWordsInString=null;
    }
    @Test
    public void givenStringShouldReturnTransposedString(){
        String result=reverseWordsInString.transposeWords(" a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }
    @Test
    public void givenStringShouldReturnTheSameString(){
        String result=reverseWordsInString.transposeWords("this is stackroute");
        assertEquals("siht si etuorkcats",result);
    }
    @Test
    public void givenStringShouldReturnNull(){
        String result=reverseWordsInString.transposeWords(null);
        assertNull("passed",result);
    }

}