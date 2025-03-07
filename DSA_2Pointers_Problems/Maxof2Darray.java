package DSA_2Pointers_Problems;

public class Maxof2Darray {
    public static void main(String[] args) {
        int [][] array = {
                {1,10,3,8},
                {9,12,6,7},
                {5,2,11,4}
        };

        int rowMax=Integer.MIN_VALUE;
        int row_Len = array.length;
        int col_len =array[0].length;

        for(int i=0;i<row_Len;i++)
        {
            for (int j=0;j<col_len;j++)
            {
                int val = array[i][j];
                if(val>rowMax)
                {
                    rowMax =val;
                }

            }
            System.out.println("Row Max is : "+rowMax);
            rowMax=0;
        }
    }
}
