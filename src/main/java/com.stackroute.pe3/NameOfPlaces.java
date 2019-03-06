package com.stackroute.pe3;

/*
 * Write a program to set up an array of places, Loop round and remove the vowels. Display the new
 * words in console
 */

public class NameOfPlaces {

    /*
     * this function takes a string array as an input and returns an output string array after removing all
     * the vowels from the strings
     */

    public String[] noVowel(String[] in){

        if (in != null) {
            String[] out = new String[in.length];
            for (int i = 0; i < in.length; i++) {
                out[i] = "";
                for (int j = 0; j < in[i].length(); j++) {
                    // skips if a charater is a vowel else adds it to the output string
                    if (!isVowel(in[i].charAt(j))) {
                        out[i] += in[i].charAt(j);
                    }
                }
            }
            return out;
        }
        return null;


    }

    static boolean isVowel (char c_in){
/*
 * function to check if the given character is a vowel or not and returns
 * a boolean value
 */
        switch(c_in){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return true;
            default : return false;
        }

    }

}
