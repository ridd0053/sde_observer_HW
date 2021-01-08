package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    public static String readLine() {

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = obj.readLine();

            return str;
        }
        catch(IOException ex) {

            return "";
        }
    }

    public static void writeLine(String str) {

        System.out.println(str);
    }
    public static String[] getWords(String sentence) {

        String[] words = sentence.split("\\s+");

        return words;
    }
}