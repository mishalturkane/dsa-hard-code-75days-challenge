package day04;

public class SubArray {
    public static  void printSubArr(int []arr){
        int max;
        int currSum=0;
        max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(max<currSum){
                    max=currSum;
                }
            }
        }
        System.out.println("max sum = "+max);
    }

    public static void main(String[] args) {
        int [] arr={1,-2,6,-1,3};
        printSubArr(arr);
    }
}
