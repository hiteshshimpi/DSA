package DSA_2Pointers_Problems;

public class ReverseaString {

    public static void main(String[] args) {

        String s = "wiiw";
        boolean value = palindrome(s);
        if(value)
        {
            System.out.println("It is palindrome");
        }
        else {
            System.out.println("It is not palindrome");
        }
    }

    static boolean palindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        StringBuilder strNew = new StringBuilder();

        while (end >= 0) {
            if (s.charAt(start) == s.charAt(end)) {
                strNew.append(s.charAt(end));
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
