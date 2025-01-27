package DSA_2Pointers_Problems;

public class SumOfElements {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
       int totalSum= sumElements(array);
        System.out.println("Total Sum of All Elements is :: "+totalSum);
        int totalsSum= sumOfAllElements(array);
        System.out.println("Total Sum of All Elements is :: "+totalsSum);
    }

    public static int sumOfAllElements(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum+arr[i];
        }
        return sum;
    }
    public static int sumElements(int [] arr)
    {
        int sum = 0;
        int i=0;
        int j =arr.length-1;
        while (i<=j)
        {
            if(arr[i]!=arr[j])
            {
                sum = sum+ arr[i]+arr[j];
                i++;
                j--;
            }else

            {
                sum=sum+arr[i];
                i++;
                j--;
            }
        }
        return sum;
    }
}
