package DSA_2Pointers_Problems;

public class CheckVowels {
    public static void main(String[] args) {
        String str = "htsh";
        if(str.toLowerCase().matches(".*[aeiou].*"))
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");

        }
    }
}
