package DSA_2Pointers_Problems;

public class ApplesOranges {
    public static void main(String[] args) {
      int s = 7 ;
      int t= 11 ;
      int a =4;
      int b=12;
      int countApple=0;
      int countOranges=0;
      int [] apples=  {2, 3, -4};
      int oranges []= {3,-2,-4};

      for(int i=0;i<apples.length;i++)
      {
          int value = a+apples[i];
          if(value>=s && value<=t)
          {
              countApple+=1;
          }
      }
      for(int i=0;i<oranges.length;i++)
      {
          int value = b+oranges[i];
          if(value>=s && value<=t)
          {
              countOranges+=1;
          }
      }

        System.out.println(countApple +" Oranges is: "+countOranges);













    }
}
