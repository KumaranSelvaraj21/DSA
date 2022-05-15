package dsa.week1;

import java.util.Scanner;

public class MinimumOf2Numbers {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1<=num2){
            System.out.print(num1);
        }else{
            System.out.print(num2);
        }
    }
}
