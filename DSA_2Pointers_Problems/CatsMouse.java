package DSA_2Pointers_Problems;

public class CatsMouse {
    public static void main(String args[])
    {
        int x =1;
        int y=3;
        int z=2;

        int catA= Math.abs(x -z);
        int catB=Math.abs(y-z);

        if(catA>catB)
        {
            System.out.println("Cat B");
        }
        else if(catA<catB)
        {
            System.out.println("Cat A");
        } else if (catA==catB) {
            System.out.println("Mouse C");

        }
    }
}
