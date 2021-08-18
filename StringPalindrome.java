public class StringPalindrome {
    public static void main(String[] args) {
        String s = "abcd";
        StringPal(s);
    }

    static void StringPal(String s) {
        int count = 0;
        int t = 0;
        char c1 = ' ';
        char c2 = ' ';
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            c1 = s.charAt(i);
            c2 = s.charAt(j);
            if (c1 > c2) {
                t = c1 - c2;
            } else {
                t = c2 - c1;
            }
            count = count + t;
            i++;
            j--;
        }
        System.out.println(count);
    }
}