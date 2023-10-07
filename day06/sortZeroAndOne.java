package day06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortZeroAndOne {
    public static void sortOne(int [] arr){
       int left=0;
       int right=arr.length-1;
       int temp;
       while(left<right){
           if(arr[left]==1){
               if(arr[right]!=1){
                   temp=arr[left];
                   arr[left]=arr[right];
                   arr[right]=temp;
               }right--;
           }else
               left++;
       }
    }


    public static void main(String[] args) {
        int [] arr={0,1,0,1,0,1,0,0,1};
        sortOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
