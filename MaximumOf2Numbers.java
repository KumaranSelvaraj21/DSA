package dsa.week1;

import java.util.Scanner;

public class MaximumOf2Numbers {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a>=b){
            System.out.print(a);
        }else{
            System.out.print(b);
        }

    }
}
