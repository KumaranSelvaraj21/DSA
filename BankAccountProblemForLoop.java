package dsa.week1;

import java.util.Scanner;

public class BankAccountProblemForLoop {

//    Problem Description
//
//    You are given a Bank account having N amount and you are asked to perfrom ADD(credit)
//    and SUBTRACT(debit) operations.
//
//    After each operation print the amount left in the Bank account.
//    If the debit amount is greater than current balance print "Insufficient Funds"(without quotes)
//    and the operation is skipped.
//
//            Problem Constraints
//
//        1 <= N, X <= 1011
//            1 <= Number of operations <= 105
//
//    Input Format
//
//    First line contains a single integer N denoting the balance in bank account.
//
//    Second line contains a single integer M denoting the number of operations.
//
//    Each of next M lines contains two space separated integers Type and Amount(X).
//
//    If Type == 1, Perform ADD operation.
//    If Type == 2, Perform SUBTRACT operation.
//    Output Format
//
//    Print Amount in the bank balance after each operation on a new line.
//
//        Example Input
//
//        1000
//        3
//        1 500
//        2 1400
//        2 500

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bankBalance = sc.nextLong();
        int numberOfOperationToDo = sc.nextInt();
        for(int i=1; i<=numberOfOperationToDo; i++){
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
        }
    }


}
