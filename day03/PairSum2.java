package day03;

import java.util.Arrays;

public class PairSum2 {
    public static int pairSum(int [] arr,int target){
        int sum;
        int count=0;
        int start=0,end=arr.length-1;
        while(start<end){
            sum=arr[start]+arr[end];
            if(sum==target){
                ++count;
                start++;
                end--;
            }else if(sum>target){
                end--;
            }else start++;
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr={3,5,6,7,8,2,1,3,4,5,3};
        System.out.println(pairSum(arr,6));
    }
}
