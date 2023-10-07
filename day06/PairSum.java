package day06;

public class PairSum {
    public static int parSum(int [] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                   count++;
                }
            }
        }
        return count;
    }
    public  static int optiPairSum(int [] arr,int target){
        int count=0;
        int start=0;
        int  end=arr.length-1;
         while(start<end){
             int sum=arr[start]+arr[end];
             if(sum==target){
                 ++count;
                 start++;
                 end--;
             }else if(sum>target){
                 end--;
             }else {
                 start++;
             }
         }
        return count;
    }


    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
       // System.out.println( parSum(arr,6));
        System.out.println(   optiPairSum(arr,8));
    }
}
