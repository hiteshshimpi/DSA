import java.util.Scanner;

public class NameGreet {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the your name: ");
        String name= input.next();
        System.out.println("Hello, Good Morning Mr. "+name);
    }
}
