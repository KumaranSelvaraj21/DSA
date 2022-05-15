package dsa.self;

import java.util.Scanner;

public class FizzBuzzProblem {

    public static void main(String[] args) {
//        Rules of the FizzBuzz Game
//        The rules of the FizzBuzz game are very simple.
//
//        Say Fizz if the number is divisible by 3.
//        Say Buzz if the number is divisible by 5.
//        Say FizzBuzz if the number is divisible by both 3 and 5.
//        Return the number itself, if the number is not divisible by 3 and 5.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num!=0){
            if(num%3==0 && num%5==0){
                System.out.print(num+":FizzBuzz, ");
            }else if(num%3==0){
                System.out.print(num+":Fizz, ");
            }else if(num%5==0){
                System.out.print(num+":Buzz, ");
            }else {
                System.out.print(num+":Self, ");
            }
            num--;
        }

    }
}
