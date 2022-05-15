package dsa.week1;

import java.util.Scanner;

public class DivisibleBy5And11Check {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%5==0 && num%11==0)
            System.out.print(1);
        else{
            System.out.print(0);
        }
    }
}
