package DSA_2Pointers_Problems;

public class ElectronicShop {
    public static void main(String[] args) {
        int[] keyboards = {3,1};
        int[] drives = {5,2,8};
        int b = 10;
        int key_value=0;
        int drive_value =0;
        int value=0;
        for (int i = 0; i<keyboards.length;i++)
        {
            key_value =key_value+keyboards[i];

        }
        for (int i=0;i<drives.length;i++){
            drive_value=drive_value+drives[i];
        }
        System.out.println(key_value + " "+drive_value);
        value = (key_value /keyboards.length) + (drive_value /keyboards.length);
        System.out.println(value);
        if(value<=b)
        {
            System.out.println(value);
        }
        else
        {
            System.out.println("-1");
        }













    }
}