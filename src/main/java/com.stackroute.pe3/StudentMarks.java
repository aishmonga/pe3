package com.stackroute.pe3;

import java.util.Scanner;

/*
 *Create a class called StudentMarks, which prompts user for the number of students, reads it
 *from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
 *grades of each of the students and saves them in an int array called stuGrades. Your program shall
 *check that the grade is between 0 and 100 else has to trow an error message.
 */

public class StudentMarks extends Exception {

    /*
     * This method checks if the grades of each student are in
     * the range of 0 - 100 and throws exception otherwise
     */

    public int stuMark() throws MyException{

        int numOfStudents;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students :: ");
        numOfStudents = input.nextInt();

        int[] stuGrades = new int[numOfStudents];

        // enters the marks
        System.out.println("Enter the marks :: ");

        for(int i=0; i<numOfStudents; i++){
            stuGrades[i] = input.nextInt();
        }

        // checks if the marks are in the range 0 -100 else throws exception
        try {
            for (int i = 0; i < numOfStudents; i++) {
                if (stuGrades[i] < 0 || stuGrades[i] > 100)
                    throw new MyException("Invalid Marks");
            }
        }
        catch (MyException x){
            System.out.println(x);
            }
        finally{
            System.out.println("Finally arrived");
        }

        return 1;
    }

}
