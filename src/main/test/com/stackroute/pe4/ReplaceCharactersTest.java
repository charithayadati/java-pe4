package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {

    ReplaceCharacters replaceCharacters;
    @Before
    public void setUp(){
        System.out.println(" Before");
        replaceCharacters= new ReplaceCharacters();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        replaceCharacters=null;
    }
    @Test
    public void givenStringShouldReturnStringWithReplacedCharcters(){
        String result=replaceCharacters.replace("daily dry");
        assertEquals("faity fry",result);
    }
    @Test
    public void givenStringShouldReturnTheSameString(){
        String result=replaceCharacters.replace("cherry");
        assertEquals("cherry",result);
    }
    @Test
    public void givenStringShouldReturnNull(){
        String result=replaceCharacters.replace(null);
        assertNull("passed",result);
    }

}