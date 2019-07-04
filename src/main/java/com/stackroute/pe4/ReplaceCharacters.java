package com.stackroute.pe4;
import java.io.*;
import java.util.*;

public class ReplaceCharacters {
    public String replace(String input) { // replaces some characters in the string
        if (input != null) {
            String result = input.replace('d', 'f').replace('l', 't');;
            return result;
        }
        return null;
    }
}
