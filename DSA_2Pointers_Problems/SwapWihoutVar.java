package DSA_2Pointers_Problems;

public class SwapWihoutVar {
    public static void main(String[] args) {
        int a =4;
        int b=5;

       a =a+b;  //4+5 =9
       b= a-b;  //9-5=4
        a =a-b;  //9-4
        System.out.println(a+" -- " +b );
    }
}
