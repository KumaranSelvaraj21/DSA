package dsa.week1;

import java.util.Scanner;

public class MaximumOf3Numbers {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>=b && a>=c){
            System.out.print(a);
        }else if(b>=c){
            System.out.print(b);
        }else{
            System.out.print(c);
        }

    }
}
