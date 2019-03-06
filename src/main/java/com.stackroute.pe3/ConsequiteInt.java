package com.stackroute.pe3;

/*
 * Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
 * assume the digits are a string and use split()
 */

public class ConsequiteInt {

    /*
     * this function checks if the numbers in the string are in consecutive order and returns a boolean value
     * to the caller function
     */

    public boolean checkCons(String in){

        String[] nums = in.split(",");

        //check if each number is greater than the previous
        for (int i=0;i<6;i++){
            if(Integer.parseInt(nums[i])>=Integer.parseInt(nums[i+1])){
                return false;
            }
        }
        return true;
    }

}
