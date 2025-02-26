package DSA_2Pointers_Problems;

import java.util.Arrays;

public class OperationsArray {
    public static void main(String[] args) {
        int[] nums = {847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272};
        int length = nums.length - 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        int cnt =0;
        for(int i =0;i<nums.length; i++)
            if(nums[i]!=0){
                nums[cnt]=nums[i];
                cnt++;
            }
        while(cnt<nums.length){
            nums[cnt]=0;
            cnt++;
        }
        System.out.println(Arrays.toString(nums));
    }

}


/*
if(nums[j]==0)
        {
        while(nums[j+1]!=0)
        {
        int temp =nums[j];
        nums[j]=nums[j+1];
        nums[j+1]=temp;
        }
        }*/
