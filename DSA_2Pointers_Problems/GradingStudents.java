package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> resultList = new ArrayList<>();
        list.add(84);
        list.add(29);
        list.add(57);
        list.add(89);

        for(int i=0;i<list.size();i++) {
            if (list.get(i) < 38) {
                resultList.add(i, list.get(i));
            } else {
                double Value = list.get(i) * 1.0;
                int gradeRoundOff = (int) Math.ceil(Value / 5) * 5;
                int difference = gradeRoundOff - list.get(i);
                System.out.println(difference);
                if (difference < 3) {
                    resultList.add(i, gradeRoundOff);
                } else if (difference >= 3) {
                    resultList.add(i, list.get(i));
                }
            }
        }
        System.out.println(resultList.toString());
    }
}