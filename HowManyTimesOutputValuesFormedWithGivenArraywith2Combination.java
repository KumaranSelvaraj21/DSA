package dsa.self;

public class HowManyTimesOutputValuesFormedWithGivenArraywith2Combination {

    public static void main(String[] args){

        int[] arr = {1,2,3,2,1};  //output = 5 //combination 2,3; 3,2;
//        int[] arr = {1,1,1}; //o/p=2 //combination - 1,1; 1,1; 1,1
        int count=0;
        for(int i=0; i<=arr.length-1; i++){
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[i]+arr[j]==3){
                    count++;
                }
            }
        }
        System.out.print("Maximum combination output can be formed is: "+count);


    }
}
