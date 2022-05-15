package dsa.week2;

import java.util.Scanner;

public class Palindrome {

    private int isPalindrome(int A) {
        int rem;
        int reverse = 0;
        int n=A;
        while (n > 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        System.out.println(reverse);
        if (reverse == A) {
            return 1;

        } else {
            return 0;
        }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Palindrome s = new Palindrome();
        s.isPalindrome(n);
    }
}
