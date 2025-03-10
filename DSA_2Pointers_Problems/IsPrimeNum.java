package DSA_2Pointers_Problems;

public class IsPrimeNum {

    public static void main(String[] args) {
        int num =2;

        if(num ==0 || num ==1)
        {
            System.out.println("False");
        }
        if(num==2)
        {
            System.out.println("True, IS prime");
        }
        if(num % 2 ==0)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}
