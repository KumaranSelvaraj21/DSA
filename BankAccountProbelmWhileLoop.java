package dsa.self;

import java.util.Scanner;

public class BankAccountProbelmWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bankBalance = sc.nextLong();
        int numberOfOperationToDo = sc.nextInt();
        while(numberOfOperationToDo!=0){
            int type = sc.nextInt();
            long userAmt = sc.nextLong();
            if(type==1){
                bankBalance = bankBalance+userAmt;
                System.out.println(bankBalance);
            }else if(type==2){
                if(bankBalance>=userAmt){
                    bankBalance = bankBalance-userAmt;
                    System.out.println(bankBalance);
                }else{
                    System.out.println("Insufficient Funds");
                }
            }
            numberOfOperationToDo --;
        }
    }
}
