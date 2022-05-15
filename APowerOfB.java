package dsa.week1;

import java.util.Scanner;

public class APowerOfB {

    public static void main(String[] args) {

//        You are given two integers A and B. You have to find the value of A power of B.
//        i.e 2 power 3 is 2*2*2
//        NOTE: The value of answer is always less than or equal to 109.
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int start = 1;
        int sum = 1;
        while(start<=num2){
            sum = sum*num1;
            start = start+1;
        }
        System.out.print(sum);
    }
}
