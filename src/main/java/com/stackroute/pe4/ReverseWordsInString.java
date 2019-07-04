package com.stackroute.pe4;

import java.util.Arrays;
import java.util.List;

public class ReverseWordsInString {
    public String transposeWords(String input) { // reverses each and every word in a string
        if (input != null) {

            List<String> list = Arrays.asList(input.split("\\s"));
            StringBuilder result=new StringBuilder();
            for (String x:list) {
                StringBuilder output=new StringBuilder();
                for (int i = (x.length() - 1); i >= 0; i--) {

                    output= output.append(x.charAt(i));

                }
                result.append(output+" ");

            }
            return result.toString().trim();
        }
        return null;
    }

}
