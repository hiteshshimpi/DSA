import java.util.Scanner;

public class RuDo {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in rupees:   ");
        int rupee = input.nextInt();
        float conversion = rupee / 74.12f;
        System.out.println("The conversion of Rupee "+ rupee + " is " +conversion);

    }
}
