package com.stackroute.pe3;

/*
 * Write a program to compute the addition of two matrix, Read the number of rows and columns
 * as input, also the values of each matrix
 */

public class MatrixAddition {

    /*
     * This method takes two matrices as iput and returns a matrix which is the sum
     * of the two matrices
     */

    public int[][] add(int[][] in1,int[][] in2){

        int[][] out = null;

        if(in1 != null && in2 != null) {
            //initializing an array with the length of given array
            out = new int[in1.length][in1[0].length];

            //adds the array
            for (int i = 0; i < in1.length; i++) {
                for (int j = 0; j < in1[i].length; j++) {
                    out[i][j] = in1[i][j] + in2[i][j];
                }
            }
            return out;
        }

        return null;
    }

}
