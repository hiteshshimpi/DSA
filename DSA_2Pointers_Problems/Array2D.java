package DSA_2Pointers_Problems;

// Print sum of each row and column for 2d Array
public class Array2D {
    public static void main(String[] args) {
        int [][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int rowSum=0;
        int colSum=0;
        int row_len = array.length;
        int col_len = array[0].length;
        System.out.println(row_len +" "+col_len);

        //Outer loop for row
        for(int i=0;i<row_len;i++)
        {
            for(int j =0;j<col_len;j++)
            {
                int val = array[i][j];
                rowSum = rowSum  +val;
            }
            System.out.println("SumOfRows is : " +rowSum);
            rowSum=0;
        }
        for(int i=0;i<col_len;i++)
        {
            for(int j =0;j<row_len;j++)
            {
                int val = array[j][i];
                colSum = colSum  +val;
            }
            System.out.println("Sum of Column is : " +colSum);
            colSum=0;
        }
    }
}
