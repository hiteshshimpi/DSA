package DSA_2Pointers_Problems;

public class ReverseaString {

    public static void main(String[] args) {

        String s = "hitesh";
        int start = 0;
        int end = s.length()-1;
        StringBuilder strNew= new StringBuilder();

        while(end>=0)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                strNew.append(s.charAt(end));
                start++;
                end--;
            }
            else
            {
                break;
            }
        }
        System.out.println(strNew);
       if(strNew.toString().equals(s))
       {
           System.out.println("It is Palindrome");
       }

    }
}
