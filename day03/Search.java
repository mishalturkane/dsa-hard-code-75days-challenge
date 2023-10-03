package day03;

import java.util.Scanner;

public class Search {
    public static int getNum(int [] arr,int target){
       for(int i=0;i<arr.length;i++){
           if(target==arr[i])
               return 1;
       }
       return -1;
    }

    public static void main(String[] args) {
        int [] arr={4,5,6,5,4,3};

        int index=getNum(arr,5);
        if(index==-1)
            System.out.println("Number not present");
        else
            System.out.println("Number "+arr[index]+" is present");
    }
}
