package DSA_2Pointers_Problems;

public class UtopianTree {
    public static void main(String[] args) {
        int n = 4;
        int sapling_height=0;
        for(int i=0;i<=n;i++)
        {
            if(i==0)
            {
                sapling_height=1;
            }
            else if(i % 2 !=0)
            {
                sapling_height = sapling_height +sapling_height;
            }
            else
            {
                sapling_height +=1;
            }
        }
        System.out.println(sapling_height);
    }
}
