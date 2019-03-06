package com.stackroute.pe3;

/*
 *Write a program to create a ChessBoard pattern with the help of multidimensional array, where
 *WWrepresents white color and BB represents Black color.
 */

public class ChessBoard {

    /*
     * This method creates a chess board and displays the result on the console
     */

    public int board(){

        String[][] board = new String [8][8];
        //array to select he color
        String[] chooser = {"WW","BB"};

        //stores in a 2d array
        for (int i = 0 ; i < 8; i++){
            for (int j = 0 ; j < 8 ; j++){
                board[i][j] = chooser[(i+j)%2];
            }
        }


        //prints array
        for (int i = 0 ; i < 8; i++){
            for (int j = 0 ; j < 8 ; j++){
                String div = "|";
                if (j==7){
                    div = "";
                }
               System.out.print(board[i][j]+div);
            }
            System.out.println("");
        }

        return 1;
    }

}
