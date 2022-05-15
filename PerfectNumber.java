package dsa.week2;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        //6 = 1+2+3 = 6 - is perfect Number
        //4 = 1+2 = 3 is not a perfect number
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            int A = sc.nextInt();
            int sum=0;
            for(int j=1; j<=A-1; j++){
                if(A%j==0){
                    sum = sum+j;
                }
            }
            if(sum==A){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
