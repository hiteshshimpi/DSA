package DSA_2Pointers_Problems;

public class SherlockArray {

    public static  void main(String args[]) {
        int[] arr = {5, 6, 8, 11};
        int left_sum = 0;
        int right_sum = 0;
        int total_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            total_sum = total_sum + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            right_sum = total_sum - arr[i] - left_sum;
            if (right_sum == left_sum) {
                System.out.println("YES");
            } else {
                left_sum = left_sum + arr[i];
            }
        }
    }
}
