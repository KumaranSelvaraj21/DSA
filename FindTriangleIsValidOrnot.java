package dsa.week1;

import java.util.Scanner;

public class FindTriangleIsValidOrnot {
    public static void main(String[] args) {

//        You are given 3 integer angles(in degrees) A, B and C of a triangle.
//        You have to tell whether the triangle is valid or not.
//
//        A triangle is valid if sum of its angles equals to 180.
//        Problem Constraints
//
//        1 <= A, B, C <= 180
//
//        Input Format
//
//        First line of the input contains an integer A.
//
//                Second line of the input contains an integer B.
//
//        Third line of the input contains an integer C.
//        Output Format
//
//        Print 1 if the triangle having given sides is valid, else print 0.


        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b+c==180){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}
