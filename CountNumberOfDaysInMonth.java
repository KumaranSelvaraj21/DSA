package dsa.week1;

import java.util.Scanner;

public class CountNumberOfDaysInMonth {
    public static void main(String[] args) {
//        You are given an integer A.
//        You have to tell how many days are there in the month denoted by A in a non-leap year.
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num == 1){
            System.out.println(31);
        }else if(num == 2){
            System.out.println(28);
        }else if(num == 3){
            System.out.println(31);
        }else if(num == 4){
            System.out.println(30);
        }else if(num == 5){
            System.out.println(31);
        }else if(num == 6){
            System.out.println(30);
        }else if(num == 7){
            System.out.println(31);
        }else if(num == 8){
            System.out.println(31);
        }else if(num == 9){
            System.out.println(30);
        }else if(num == 10){
            System.out.println(31);
        }else if(num == 11){
            System.out.println(30);
        }else if(num == 12){
            System.out.println(31);
        }else{
            System.out.println("Invalid month number");
        }
    }
}
