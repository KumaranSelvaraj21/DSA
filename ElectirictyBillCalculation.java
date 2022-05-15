package dsa.self;

import java.util.Scanner;

public class ElectirictyBillCalculation {

    public static void main(String[] args) {

        /* First 50 units 0.5/unit
        Next 100 units 0.75/unit
        Next 100 units 1.2/units
        Anything after 250 units 1.5/unit */
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill = 0;
        if(units<=50){
            bill = units*0.5;
        }else if(units>50 && units<=150){
            bill = 50*0.5+(units-50)*0.75;
        }else if(units>150 && units<=250){
            bill = 50*0.5+100*0.75+(units-150)*1.2;
        }else if(units>250){
            bill = 50*0.5+100*0.75+100*1.2+(units-250)*1.5;
        }
        System.out.print("Calculated bill amount is: "+bill);
    }
}
