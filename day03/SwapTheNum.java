package day03;

public class SwapTheNum {
    public static void swapNum(int a,int b){
        int temp;
       temp=a;
       a=b;
       b=temp;
        System.out.println("after swapping");
       System.out.println("a is:"+a+" b is:"+b);
    }
    public static  void swapNum2(int a,int b){
        a=a+b;   // a+b=a(7)
        b=a-b;
        a=a-b;
        System.out.println("after swapping");
        System.out.println("a is:"+a+" b is:"+b);
    }

    public static void main(String[] args) {
        System.out.println("Before wapping");
        int a=4,b=3;
        System.out.println("a is:"+a+" b is:"+b);
        swapNum(a,b);

        swapNum2(a,b);
    }
}
