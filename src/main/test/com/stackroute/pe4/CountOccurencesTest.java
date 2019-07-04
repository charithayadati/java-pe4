package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class CountOccurencesTest {
    CountOccurences countOccurences;

    @Before
    public void setUp(){
        System.out.println(" Before");
        countOccurences= new CountOccurences();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        countOccurences=null;

    }

    @Test
    public void givenStringShouldReturnCountOfOccurencesOfAElement(){
        int result=countOccurences.count("Java is java again java again",'a');
        assertEquals(10,result);
    }
    @Test
    public void givenStringShouldReturnCountOfOccurences(){
        int result=countOccurences.count("Java is java again ",'e');
        assertEquals(0,result);
    }
    @Test
    public void givenStringShouldReturnNull(){
        int result=countOccurences.count(null,'a');
        assertEquals(0,result);
    }
}