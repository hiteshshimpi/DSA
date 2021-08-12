import java.util.Scanner;

public class calculator {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int Fs = input.nextInt();
        System.out.print("Enter the second number : ");
        int Sc=input.nextInt();
        System.out.print("Enter the operation you want to perform: 1. + ,2. -,3.* ,4. / : ");
         int Op=input.nextInt();
        if (Op == 1){
            int result = (Fs + Sc);
            System.out.println(result);
        }
        if (Op == 2){
            int result = (Fs - Sc);
            System.out.println(result);
        }
        if (Op == 3){
            int result = (Fs * Sc);
            System.out.println(result);
        }
        if (Op == 4){
            int result = (Fs / Sc);
            System.out.println(result);
        }
    }
}
