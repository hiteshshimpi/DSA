package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(3,4,7,5,6,2,1));

        for(int i=0;i<=arr.size()-2;i++){
            int temp;
            for(int j=i+1;j>0;j--)
            {
                if(arr.get(j)<arr.get(j-1))
                {
                    Collections.swap(arr,j,j-1);
                }
                else {

                    break;
                }
            }
            String formattedString = arr.toString()
                    .replace(",", "")  //remove the commas
                    .replace("[", "")  //remove the right bracket
                    .replace("]", "")  //remove the left bracket
                    .trim();
            System.out.println(formattedString);
        }

    }
}

