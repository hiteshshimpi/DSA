import java.util.Scanner;

public class SpanofArray {
    public static void main(String[] args) {
        Scanner sxcn =new Scanner(System.in);
        int n =sxcn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sxcn.nextInt();
        }
        spanarray(arr);
    }
     static void spanarray(int[] arr){
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i< arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        else if(arr[i]<min){
            min=arr[i];
        }
        }
        System.out.println("max num is"+ max);
        System.out.println("min num is"+ min);
    int span = max-min;
        System.out.println(span);
    }
}
