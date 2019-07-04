package com.stackroute.pe4;

public class FindAWordInString {
    public String findTheWord(String input) { //finds whether the given word is present in a string or not
        boolean output;
        if (input != null) {
            output = input.matches(".*?\\Harry\\b.*?");
            if (output == true) {
                return "Harry is here";
            } else {
                return "Harry is not here";
            }
        }
        return null;
    }

}
