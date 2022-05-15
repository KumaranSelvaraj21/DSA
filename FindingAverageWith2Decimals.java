package dsa.self;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FindingAverageWith2Decimals {

    public static void main(String[] args){
//        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        double avg =  (a+b+c+d+e)/5.0;
        System.out.format("%.2f",avg);
//        df.setRoundingMode(RoundingMode.UP);
//        System.out.print(df.format(avg));
    }
}
