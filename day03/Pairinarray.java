package day03;

public class Pairinarray {
    public static void pairArray(int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pair "+count);
    }
    public static int pairSum(int [] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                      if(arr[i]+arr[j]==target){
                         count++;
                         System.out.print("("+arr[i]+","+arr[j]+") ");
                      }

            }
            System.out.println();
        }
       return count;
    }

    public static void main(String[] args) {
        int [] arr={3,5,6,7,8,2,1,3,4,5,3,4,4,5,5,6,0,45,3,3,45,5,5,5};
      pairArray(arr);
    }
}
