package DSA_2Pointers_Problems;

import java.util.Arrays;

public class Rotate2Darray {
    public static void main(String[] args) {
        int [][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int rowLen=array.length;
        int column_len = array[0].length;
        for(int i =0;i<rowLen;i++)
        {
            for (int j=i;j<column_len;j++)
            {
                int temp = array[i][j];
                array[i][j] =array[j][i];
                array[j][i]=temp;
            }
        }

     // Swap the row

        for(int i =0;i<rowLen;i++)
        {
            int l =0;
            int r =column_len-1;

            while(l<r)
            {
                int temp =array[i][l];
                array[i][l]=array[i][r];
                array[i][r]=temp;
                r--;
                l++;
            }
        }
        for (int[] row : array)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

}
