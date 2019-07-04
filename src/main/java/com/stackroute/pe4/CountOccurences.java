package com.stackroute.pe4;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class CountOccurences {
    public int count(String input , char element){ //counts the number of times a element occured in a string
        int count=0;
        if(input!=null) {
            List<Character> list = input.chars().mapToObj(x -> (char) x).collect(Collectors.toList());

            ListIterator iterator = list.listIterator();
            while (iterator.hasNext()) {


                if (iterator.next().equals(element)) {
                    count++;
                }

            }
        }
        return count;
    }
}
