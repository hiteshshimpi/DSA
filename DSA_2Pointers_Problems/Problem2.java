package DSA_2Pointers_Problems;

public class Problem2 {
    // Given sorted array find the no. of pairs which has sum = k;
    public static void main() {


        int[] arr = {1, 4, 4, 5, 5, 5, 5, 6, 6, 6, 11};
        int start = 0;
        int k=11;
        int c1=0;
        int c2=0;

        int end = arr.length - 1;
        while (start < end) {
            if(arr[start] + arr[end] >k)
            {
                start++;
            }
            else if(arr[start]+ arr[end] < k)
            {
                end--;
            }
            else
            {
                if(arr[start]!=arr[end])
                {
                    while (start<end)
                    {
                        if(arr[start]==arr[start]+1)
                        {
                             c1 = c1+1;
                             start++;
                        }
                        else
                        {

                        }
                    }
                }
            }
        }
    }
}