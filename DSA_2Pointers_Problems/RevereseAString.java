package DSA_2Pointers_Problems;

public class RevereseAString {
    public static void main(String[] args) {

        String str = "This is a string";
        String reverseStr = "";
        int count =0;
        for(int i =str.length()-1;i>=0;i--){
            reverseStr +=str.charAt(i);
            if(str.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println(reverseStr);
        System.out.println(count);
    }
}
