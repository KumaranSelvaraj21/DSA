package dsa.self;

import java.util.ArrayList;
import java.util.List;

public class FindOddMin_EvenMax_Subtract_Arrays {
    public static void main(String[] args){

        int[] a = {5,17,100,1};
        int[] even = new int[a.length];
        int[] odd = new int[a.length];
        for(int i=0; i<=a.length-1; i++){
            if(a[i]%2 == 0){
                even[i] = a[i];
            }else{
                odd[i] = a[i];
            }
        }
        int min = odd[0];
        int max = even[0];
        for(int j=0; j<=odd.length-1; j++){
            if(odd[j]<=min && odd[j]>0){
                min = odd[j];
            }
        }
        for(int k=0; k<=even.length-1; k++){
            if(even[k]>=max && even[k]>0){
                max = even[k];
            }
        }
        System.out.println("Subtracted amount from odd min and even max is: "+(max-min));
    }
}
