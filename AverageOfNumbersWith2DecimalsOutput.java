package dsa.week1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageOfNumbersWith2DecimalsOutput {
    public static void main(String[] args) {
        //Given 5 numbers A, B, C, D, E as input. Print the average of these 5 numbers (correct up to 2 decimal places).
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        double avg =  (a+b+c+d+e)/5.0;
        df.setRoundingMode(RoundingMode.UP);
        System.out.print(df.format(avg));
    }
}
