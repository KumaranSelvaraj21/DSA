package dsa.week2;

import java.util.Scanner;

public class HCFOf2Numbers {

    public static void main(String[] args){

        //HCF = Highest common factors of 2 numbers
        // a=8 = 1,2,4,8
        // b=4 = 1,2,4
        // HFC would definetly be less than or equal to smaller of 2 numbers which b
        // and from there it divides both a and b at one point

        Scanner sc1 = new Scanner(System.in);
        int t = sc1.nextInt();
        for(int j=1; j<=t; j++){
            int n1 = sc1.nextInt();
            int n2 = sc1.nextInt();
            if(n1<=n2){
                for(int i=n1; i>=1; i--){
                    if(n1%i==0 && n2%i==0){
                        System.out.println(i);
                        break;
                    }
                }
            }else{
                for(int i=n2; i>=1; i--){
                    if(n1%i==0 && n2%i==0){
                        System.out.println(i);
                        break;
                    }
                }
            }
        }


//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for(int i=1; i<=t; i++){
//            int num1 = sc.nextInt();
//            int num2 = sc.nextInt();
//            int g, s, rem;
//            if(num1>=num2){
//                g=num1;
//                s=num2;
//            }else{
//                g=num2;
//                s=num1;
//            }
//            while(g!=0){
//                rem = g%s;
//                if(rem==0){
//                    System.out.println(s);
//                    break;
//                }else{
//                    g=s;
//                    s=rem;
//                }
//            }
//        }

    }
}
