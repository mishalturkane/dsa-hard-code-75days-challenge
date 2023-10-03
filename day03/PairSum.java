package day03;

import java.util.Arrays;

public class PairSum {
    public  static int pairSum(int [] arr,int target){
        int count=0;
        int sum;
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                if(sum==target){
                    ++count;
                }
            }
        }
        return count;
    }
    public static int optiPairSum(int [] arr,int target){
        int count=0;
        int sum;
        int start=0;
        int end=arr.length-1;
       while(start<end){
            sum=arr[start]+arr[end];
            if(sum==target){
                ++count;
                start++;
                end--;
            }
            else if(sum>target){
                end--;
            }
            else {
                start++;
            }
        }
       return count;
    }

    public static void main(String[] args) {
        int [] arr={2,1,3,4,5,4};
        Arrays.sort(arr);
        System.out.println(pairSum(arr,6));

        System.out.println(optiPairSum(arr,6));
    }
}
