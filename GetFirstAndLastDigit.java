package dsa.week2;

import java.util.Scanner;

public class GetFirstAndLastDigit {

    public static void main(String[] args) {

        //input 1001 and output is 1,1
        //input 5 and output is 5,5
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i=1; i<=times; i++){
            int num = sc.nextInt();
            int lastDigit = num%10;
            int firstDigit = num;
            while(num!=0){
                firstDigit = num;
                num = num/10;
                if(num == 0) break;
            }
            System.out.print(firstDigit+" "+lastDigit);
            System.out.println();
        }
    }
}
