package dsa.week1;

import java.util.Scanner;

public class FindProfitOrLoss {

    public static void main(String[] args) {

//        Problem Description
//
//        You are given the Cost Price C and Selling Price S of a Product. You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.
//
//        NOTE: It is guaranteed that Cost Price and Selling Price are not equal.
//
//        Problem Constraints
//
//        1 <= C, S <= 109
//
//        C ≠ S
//
//        Input Format
//
//        First line of the input contains a single integer C.
//
//        Second line of the input contains a single integer S.
//
//        Output Format
//
//        Print two integers in separate lines.
//
//        First integer denotes whether there is a profit or loss. If there is a profit, print 1, else print -1.
//
//        Second integer is a non-negative integer denoting the absolute value of total profit or loss.
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int costPrice = sc.nextInt();
        int sellingPrice = sc.nextInt();
        int profit_loss = 0;
        if(costPrice<sellingPrice){
            System.out.println(1);
            profit_loss = sellingPrice-costPrice;
            System.out.print(profit_loss);
        }else{
            System.out.println(-1);
            profit_loss = costPrice-sellingPrice;
            System.out.print(profit_loss);
        }
    }
}
