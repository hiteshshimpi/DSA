import java.util.Scanner;

public class Evenodd {

    public static  void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int first_num=input.nextInt();
        if (first_num % 2 == 0){
            System.out.println("The number is Even: "+first_num);
        }
        else{
            System.out.println("The number is odd: "+first_num);
        }
    }
}
