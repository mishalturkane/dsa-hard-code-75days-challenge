package day03;

public class FindLargeSmall {
    public static int getBig(int [] arr){
        int big=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(big<arr[i]){
                big=arr[i];
            }
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("The smallest values is :"+small);
        return big;
    }

    public static void main(String[] args) {
        int [] arr={3,2,1,4,5,6,7};
        System.out.println("The largest values is :"+getBig(arr));
    }
}
