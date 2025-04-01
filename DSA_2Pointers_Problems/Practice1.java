package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        Boolean val = arrayListCode();
        System.out.println(val);

    }


    public static  boolean arrayListCode() {
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int[] arr = {1, 2, 3, 4, 5};
        int price = 5;

        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) == price) {
                return true;
            }
        }
        return false;
    }
}