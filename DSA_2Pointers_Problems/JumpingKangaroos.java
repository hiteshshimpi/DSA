package DSA_2Pointers_Problems;

public class JumpingKangaroos {
    public static void main(String args[])
    {
        //21 6 47 3
       // 4181 3976 6312 988
        //0 3 4 2
        int x1=4181;
        int v1=3976;
        int x2=6312;
        int v2=988;
        int k1,k2=0;

        while(!(v2 > v1) && (x2 > x1)) {

            if(v2>v1 && x2>x1)
                    {
                    System.out.println("NO");
                    return;
                    }
                k1 = x1 + v1;
                k2 = x2 + v2;
                if (k1 == k2) {
                    System.out.println("Yes");
                    return;
                } else {
                    x1 = k1;
                    x2 = k2;
                }
            }
        System.out.println("NO");





















    }
}
//for(int i=0;i<=x;i++)
//        {
//        if(v2>v1 && x2>x1)
//        {
//        System.out.println("NO");
//        return;
//        }
//        else
//        {
//        k1 =x1+v1;
//        k2 =x2+v2;
//        if(k1==k2)
//        {
//        System.out.println("Yes");
//        return;
//        }else
//        {
//        x1=k1;
//        x2=k2;
//        }
//
//        }
//        }