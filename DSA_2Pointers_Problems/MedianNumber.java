package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.List;

public class MedianNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8933);
        list.add(902);
        list.add(3304);
        list.add(4059);
        list.add(7377);
        findMedian(list);
    }

    public static void findMedian(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        System.out.println(sum / list.size());
    }

}
