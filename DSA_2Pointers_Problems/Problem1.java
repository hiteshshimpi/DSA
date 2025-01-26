package DSA_2Pointers_Problems;

public class Problem1 {
    public static void main(String[] args) {
        int arr[] = {2,5,7,9,10,11};
        int target=7;
        twoPointer(arr,target);
    }

    public  static void twoPointer(int [] arr, int target)
    {
        int p1=0;
        int p2= arr.length-1;
        int sum=0;
        while(p1<=p2)
        {
            sum= arr[p1]+arr[p2];
            if(sum<target)
            {
                p1++;
            }
            else if(sum>target)
            {
                p2--;
            }
            else if(sum==target)
            {
                System.out.println("We got the Sum");
                break;
            }
            else
            {
                System.out.println("No Sum pair available");
            }
        }
    }
}
