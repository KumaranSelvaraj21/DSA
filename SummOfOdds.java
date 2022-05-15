package dsa.week1;

import java.util.Scanner;

public class SummOfOdds {

    public static void main(String[] args) {

//        You are given a positive integer A. You have to print the sum of all odd numbers in the range [1, A].
//        For num = 4, Odd numbers 1 and 3 lie in the range [1, 4].
//        Sum = 1 + 3 = 4.
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = 1;
        int sum = 0;
        while(start<=num){
            sum = sum+start;
            start = start+2;
        }
        System.out.print(sum);
    }
}
