package dsa.week2;

import java.util.Scanner;

public class CountOfDigitsofGivenNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=1; i<=T; i++){
            int count = 0;
            int num = sc.nextInt();
            while(num>=0){
                num = num/10;
                count++;
                if(num==0) break;
            }
            System.out.println(count);
        }

    }
}
