package DSA_2Pointers_Problems;

public class DesignerPdf {
    public static void main(String[] args) {
        int [] h = {1 ,3 ,1 ,3 ,1 ,4 ,1 ,3 ,2 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,7};
        String word ="zaba";
        int letter= word.length();
        System.out.println(letter);
        int ch ='a';
        int val =0;
        int height =0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<word.length();i++){
            int alphabet = word.charAt(i);
            val =Math.abs(alphabet-ch);
            height=h[val];
            if(max<height)
            {
                max=height;
            }
        }
        System.out.println(max*letter);
    }

}
