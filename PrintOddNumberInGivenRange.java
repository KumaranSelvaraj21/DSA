package dsa.week1;

import java.util.Scanner;

public class PrintOddNumberInGivenRange {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = 1;
        while(start<=num){
            System.out.print(start+" ");
            start = start+2;
        }
    }

}
