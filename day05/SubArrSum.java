package day05;

public class SubArrSum {
    public static void printSub(int [] arr){

      for(int i=0;i<arr.length;i++){
          for(int j=i;j<arr.length;j++){
              for(int k=i;k<=j;k++){
                  System.out.print(arr[k]+" ");
              }
              System.out.println();
          }
          System.out.println();
      }
    }

    public static void printSum(int []arr){
        int currSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        int  [] arr={2,4,6,8,10};
        printSub(arr);
    }
}
