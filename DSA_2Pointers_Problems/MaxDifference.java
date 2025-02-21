package DSA_2Pointers_Problems;

public class MaxDifference {

    // Find max difference between to adjacent arrays


    public static void main(String[] args) {
        int [] arr ={1,4,8,15,17};
        int diff=0;
        for (int i=0;i<arr.length-1;i++)
        {
           int sum = arr[i+1] -arr[i];
            if(sum>diff)
            {
                diff=sum;
            }
        }
        System.out.println(diff);
    }
}
