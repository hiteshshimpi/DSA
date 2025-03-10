package DSA_2Pointers_Problems;

public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        int fac =1;

        for (int i = 0; i < num; i++) {
            int sum = num - i;
             fac = sum * fac;
        }
        System.out.println(fac);
    }
}