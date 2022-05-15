package dsa.week2;

import java.util.Scanner;

public class LCMOF2Numbers {

    public static void main(String[] args) {

        //LCM = Least Common Multiples
        //a = 4 = 4,8,12,16,20,24,28,32,36
        //b = 3 = 3,6,9,12,15,18,21,24,27
        //LCM would be definetly greater than or equal to bigger of 2 numbers which a
        // and divides both numbers from there by incrementing if it meets then that is LCM of 2 numbers
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>=num2){
            for(int i=num1; i<=1000000000; i++){
                if(i%num1==0 && i%num2==0){
                    System.out.println(i);
                    break;
                }
            }
        }else{
            for(int i=num2; i<=1000000000; i++){
                if(i%num1==0 && i%num2==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
