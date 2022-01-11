public class ReverseaString {
    public static void main(String[] args) {
        String name="Hitesh";
        int count=1;
        int len=name.length();
        System.out.println(len);
        for(int i=0;i>=0;i--){
            i=len-count;
            char fina = name.charAt(i);
            System.out.println(fina);
            count +=1;
        }


    }
}
