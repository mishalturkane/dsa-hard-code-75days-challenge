package day03;

public class ReverseArray {
    public  static  void reverse(int [] arr){
        int start=0,end=arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] arr={2,3,4,5,3,4,5};
        System.out.println("Before swapping");
        for(int x: arr) {
            System.out.print(x+" ");

        }
        System.out.println();
        reverse(arr);
        System.out.println("After swapping");
        for(int x: arr){
            System.out.print(x+" ");
         }
            System.out.println();

    }
}
