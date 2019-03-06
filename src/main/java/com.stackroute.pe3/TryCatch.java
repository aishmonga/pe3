package com.stackroute.pe3;

/*
 * Create a class with a main( ) that throws an object of class Exception inside a try block.
 * a. Give the constructor for Exception a String argument.
 * b. Catch the exception inside a catch clause and print the String argument.
 * c. Add a finally clause and print a message to prove you were there.
 */

public class TryCatch extends Exception {
     /*
      * function to demonstrate the working of my exception
      */

    public static void main(String[] args) throws MyException{



        try {
            if(true)
            throw new MyException("TOO HIGH");
        }
        catch (Exception e) {

            System.out.println("Exception caught :: "+e);

        }
        finally{
            System.out.println("finally block");
        }

    }

}

