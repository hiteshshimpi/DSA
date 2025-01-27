package DSA_2Pointers_Problems;

public class PlusMinus {
    public static void main(String[] args) {
        int arr[]={-4,3,-9,0,4,1};
        int n= arr.length;
        double ratio;
        int positive =0;
        int negative =0;
        int zeros=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                positive+=1;
            }
            else if (arr[i]<0)
            {
                negative+=1;
            }
            else
            {
                zeros+=1;
            }

        }

        Double ratio_positive=(double) positive / n;
        Double ratio_negative=(double) negative / n;
        Double ratio_zeros=(double) zeros / n;
        String formattedResult = String.format("%.6f", ratio_positive);
        String formattedResult1 = String.format("%.6f", ratio_negative);
        String formattedResult2 = String.format("%.6f", ratio_zeros);
        System.out.println("positive Ratio is : "+formattedResult);
        System.out.println("negative Ratio is : "+formattedResult1);
        System.out.println("zero's Ratio is : "+formattedResult2);
    }
}
