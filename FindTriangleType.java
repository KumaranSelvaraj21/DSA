package dsa.week1;

import java.util.Scanner;

public class FindTriangleType {

    public static void main(String[] args) {

//        Problem Description
//
//        Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.
//
//        You have to print if the traingle is "equilateral", "scalene" or "isosceles".
//
//                Problem Constraints
//
//        1 <= A <= 100000
//
//        1 <= B <= 100000
//
//        1 <= C <= 100000
//
//        Input Format
//
//        One line containing three space separated integers A, B & C.
//
//                Output Format
//
//        One string either "equilateral", "scalene" or "isosceles".

//        If all sides are different, hence it's a scalene triangle.
//        If all sides are same, hence it's a equilateral triangle.
//            else it is isosceles

        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if(side1==side2 && side2==side3 && side1==side3){
            System.out.print("equilateral");
        }else if(side1!=side2 && side2!=side3 && side1!=side3){
            System.out.print("scalene");
        }else{
            System.out.print("isosceles");
        }
    }
}
