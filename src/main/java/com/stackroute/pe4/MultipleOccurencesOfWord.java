package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurencesOfWord {
    public String findOccurance(String input, String word) { //counts how many time a pattern occurs in a string

        if (input != null && word!=null) {

            String patternString = word;
            StringBuilder string =new StringBuilder();

            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(input);

            int count = 0;
            while (matcher.find()) {
                count++;
                string.append("Found at: " + matcher.start() + " - " + matcher.end()+" ");
            }

            return string.toString().trim();
        }

        return null;
    }
}
