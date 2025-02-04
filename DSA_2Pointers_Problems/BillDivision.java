package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(2);
        list.add(9);

        int totalAmount=0;
        int annaItem=1;
        int annaCharged=7;

        for(int i=0;i<list.size();i++)
        {
            if(i!=annaItem)
            {
              totalAmount =totalAmount+list.get(i);
            }
        }
        totalAmount=totalAmount/2;
        if(totalAmount==annaCharged)
        {
            System.out.println("Bon Appetit");
        }else
        {
            System.out.println(Math.abs(totalAmount-annaCharged));
        }




























    }

}
