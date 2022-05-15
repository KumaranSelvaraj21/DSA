package dsa.self;

import java.util.Arrays;

public class FindMissingNumberinArray {

    public static void main(String[] args) {

        //int[] arr = {3,7,1,2,8,4,5,10};
        int[] arr = {1,3,4,6,7,9,11};
        Arrays.sort(arr); //{1,2,3,4,5,7,8,10}
        int start = arr[0];//1
        //2
//        System.out.println(arr.length);
        for(int i=0; i<arr.length-1; i++){//0,1,2,3,4,4,5,6,6
            start++;//2,3,4,5,6,7,8,9,10
            if(start != arr[i+1]){//2==2,3=3,4=4,5=5,6!=7,7=7,8=8,9!=10
                System.out.println(start);//6,9
                i--;//3,5
            }
        }

        //n=8 and missing number is 6
//        You are given an array of positive numbers from 1 to n,
//        such that all numbers from 1 to n are present except one number x.
//        You have to find x. The input array is not sorted.
//        Arrays.sort(arr);
////        1+2+3+4+5+6+7+8 - 1+2+3+4+5+7+8
//        int expectedSum= 0, sum=0;
//        System.out.println("Length: "+arr.length);
//        System.out.println(arr[arr.length-1]);
//         for(int i=arr[0]; i<=arr[arr.length-1]; i++){
//             expectedSum = expectedSum+i;
//         }
//         for(int j=0; j<=arr.length-1; j++){
//             sum = sum+arr[j];
//         }
//
//         System.out.print("Missing number in the array is: "+(expectedSum-sum));
    }
}
