package dsa.week1;

import java.util.Scanner;

public class FloorOfANB {
    public static void main(String[] args) {
        //Find Floor of A and B and output in no decimals
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print((int)Math.floor(num1/num2));
    }
}
