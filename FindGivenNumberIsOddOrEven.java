package dsa.week1;

import java.util.Scanner;

public class FindGivenNumberIsOddOrEven {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 2 ==0){
            System.out.print(0);
        }else{
            System.out.print(1);
        }
    }
}
