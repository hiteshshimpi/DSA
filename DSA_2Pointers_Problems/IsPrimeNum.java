package DSA_2Pointers_Problems;

public class IsPrimeNum {

    public static void main(String[] args) {
        int num =7;

        if(num ==0 || num ==1)
        {
            System.out.println("False");
        }
        if(num==2)
        {
            System.out.println("True, IS prime");
        }
        for(int i =2;i<num;i++)
        {
            if(num % i==0)
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("True");
    }
}
