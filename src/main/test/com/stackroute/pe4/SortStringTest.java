package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.*;

public class SortStringTest {
    SortString sortString;
    @Before
    public void setUp(){
        System.out.println(" Before");
        sortString= new SortString();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        sortString=null;
    }
    @Test
    public void givenStringShouldReturnSortedString(){
       String result=sortString.sort("Display the list");
        assertEquals("[Display, list, the]",result);
    }
    @Test
    public void givenNullShouldReturnNull(){
        String result=sortString.sort(null);
        assertEquals(null,result);
    }
    @Test
    public void givenNullhouldReturnEmpty(){
        String result=sortString.sort("");
        assertEquals(null,result);
    }


}