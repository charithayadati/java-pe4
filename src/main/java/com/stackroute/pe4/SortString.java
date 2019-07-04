package com.stackroute.pe4;
import java.io.*;
import java.util.*;
public class SortString {
    public String sort(String input) {
        if ((input != null)&&(!(input.isEmpty()))) { //sorts the words in a string

            String[] words = input.split(" ");
            List<String> result = Arrays.asList(words);
            Collections.sort(result);
            return result.toString();
        }
        return null;
    }
}