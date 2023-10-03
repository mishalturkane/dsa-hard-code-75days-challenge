package day03;

import java.util.Scanner;

public class CheckPrime {
    public static int getPrime(int n) {
        int i;
        for( i=2;i<n-1;i++){
            if(n%i==0)
                return -1;
        }

        return 1;
    }
    public static void getPrim2(int n) {
        int i;
        for( i=2;i<=n-1;i++){
            if(n%i==0)
               break;
        }
        if(n==i)
            System.out.println("prime");
        else System.out.println("Not Prime");
    }

    public static void main(String[] args) {
        int count=0;
//              for(int i=0;i<100;i++){
//                //  int n=kb.nextInt();
//                 if(getPrime(i)==1){
//                     count++;
//                 }
//              }
//        System.out.println("Total Prime nos:"+count);
        String choice="";
       do{
           Scanner kb=new Scanner(System.in);
           System.out.println("enter no:");
           int n=kb.nextInt();
           getPrim2(n);
           System.out.println("continue ? (yes/no)");
          kb.nextLine();
          choice = kb.next();
       }while(choice.equalsIgnoreCase("yes"));
    }
}

