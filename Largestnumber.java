import java.util.Scanner;

public class Largestnumber {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the 1st number:  ");
        int Fn = input.nextInt();
        System.out.print("Enter the 2nd number:  ");
        int Sn =input.nextInt();
        if (Fn > Sn){
            System.out.println("The number "+ Fn + " is greater than " + Sn );
        }
        if (Fn < Sn){
            System.out.println("The Number " + Sn + " is greater than "+ Fn);
        }
        if (Fn == Sn){
            System.out.println("The Number " + Fn + " is equal to "+ Sn);
        }
    }
}
