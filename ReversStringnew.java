public class ReversStringnew {
    public static void main(String[] args) {
        String name="Hiteshshimpi";
       int  count=1;
       int len =name.length();
       System.out.println(count);

      while(len>count){
          int finalise =len-count;
          char finalse = name.charAt(finalise);
          System.out.println(finalse);
          count=count+1;
      }
    }
}
