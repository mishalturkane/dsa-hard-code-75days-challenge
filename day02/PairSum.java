package day02;

import java.util.Arrays;

public class PairSum {
    public static int pairSum(int[] arr, int target) {
        int count = 0;
        int sum ;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    ++count;
                }
            }
        }
        return count;
    }
    public static  int optiParSum(int [] arr,int target){
        int count=0;
        int sum;
        Arrays.sort(arr);
        int start=0,end=arr.length-1;
        while(start<end){
          sum=arr[start]+arr[end];
          if(sum==target){
              ++count;
              start++;
              end--;
          }else if(sum>target){
              end--;
          }else{
              start++;
          }
        }
        return count;
    }
    public static void main(String[] args) {

        int [] arr={3,5,6,7,8,2,1,3,4,5,3};
        System.out.println(optiParSum(arr,6));
    }
}