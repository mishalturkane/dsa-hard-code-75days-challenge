package day04;

import java.util.Scanner;

public class Demo {
    public static void prime (int n){
        int i;
        for(i=2;i<n;i++){
            if(n%i==0)
                break;
        }
        if(n==i)
            System.out.println(" n is prime: "+n);
    }
    public static void smallLarge(int [] arr){
        int small=Integer.MAX_VALUE;
        int big=Integer.MIN_VALUE;

        for(int i=0;i<arr.length-1;i++){
            if(small>arr[i]){
                small=arr[i];
            }
            if(big<arr[i]){
                big=arr[i];
            }

        }
        System.out.println("Smallest is "+small);
        System.out.println("Biggest is :"+big);
    }

    public static void pairArray(int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pair's are: "+count);
    }

    public static void reverse(int [] arr){
        int first=0;
        int last=arr.length-1;
      while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {

       int [] arr={3,6,2,8,9};
     reverse(arr);
     for(int x:arr){
         System.out.print(x+" ");
     }
    }
}
