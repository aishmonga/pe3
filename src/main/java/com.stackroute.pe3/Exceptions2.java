package com.stackroute.pe3;

import java.io.BufferedReader;
import java.util.Scanner;

/*
 * Write a program that will generate exceptions of type NegativeArraySizeException,
 * IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
 * displaying the message stored in the exception object.
 */

public class Exceptions2 {

    /*
     * this checks for any kinds of errors and prints it on the console
     */
    public static void main (String[] args) {

        while (true) {

            int[] a = {1, 2, 3};
            int num;
            System.out.print("Enter number of integers : ");

            Scanner input = new Scanner(System.in);
            num = input.nextInt();


            //catches every kind of exception here
            try {
                a = new int[num];
                System.out.print("Enter number : ");
                num = input.nextInt();
                System.out.println(a[num]);
                a = new int[num];
            } catch (NegativeArraySizeException x) {
                System.out.println(x);
            } catch (IndexOutOfBoundsException x) {
                System.out.println(x);
            } catch (NullPointerException x) {
                System.out.println(x);
            } finally {
                System.out.println("Finally arrived");
            }


        }
    }

}
