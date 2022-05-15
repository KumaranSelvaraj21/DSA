package dsa.self;

import java.util.ArrayList;
import java.util.List;

public class FindOddMin_EvenMax_Subtract_ArraysList {
    public static void main(String[] args){

        int[] a = {5,17,100,1};
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i=0; i<=a.length-1; i++){
            if(a[i]%2 == 0){
                even.add(a[i]);
            }else{
                odd.add(a[i]);
            }
        }
        int min = odd.get(0);
        int max = even.get(0);
        for(int j=0; j<=odd.size()-1; j++){
            if(odd.get(j)<=min){
                min = odd.get(j);
            }
        }
        for(int k=0; k<=even.size()-1; k++){
            if(even.get(k)>=max){
                max = even.get(k);
            }
        }
        System.out.println("Subtracted amount from odd min and even max is: "+(max-min));
    }
}
