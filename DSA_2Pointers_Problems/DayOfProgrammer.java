package DSA_2Pointers_Problems;

public class DayOfProgrammer {
    public static void main(String[] args) {
        int year =1800;
        int date =0;
        int leapyear=244;
        int notAleapYear=243;
        int programerDate =256;

        if(year % 4 ==0 )
        {
            date = programerDate - leapyear;
            System.out.println(date+".09."+year);
        }
        else if(year % 100 !=0)
        {
            date = programerDate - leapyear;
            System.out.println(date+".09."+year);
        }
        else if(year % 400 ==0)
        {
            date = programerDate - leapyear;
            System.out.println(date+".09."+year);
        }
        else
        {
            date = programerDate -notAleapYear;
            System.out.println(date+".09."+year);
        }
    }
}
