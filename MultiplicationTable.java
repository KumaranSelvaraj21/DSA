package dsa.week1;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
//        For a given number A, print its multiplication table having the first 10 multiples.
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = 1;
        int end = 10;
        while(start<=end){
            System.out.println(num+" * "+start+" = "+num*start);
            start = start+1;
        }
    }
}
