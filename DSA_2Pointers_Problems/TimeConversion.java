package DSA_2Pointers_Problems;

public class TimeConversion {
    public static void main(String[] args) {
        String s ="12:45:54PM";
        StringBuilder stringBuilder = new StringBuilder(s);
        String[] ch = s.split(":");
        if(s.contains("PM")&& !s.contains("12"))
        {
            int time = Integer.parseInt(ch[0]);
            int newTime = time +12;
            ch[0]= String.valueOf(newTime);
            stringBuilder.replace(0,2,ch[0]);
            stringBuilder.replace(8,10," ");
        }
        else if(s.contains("AM") && s.contains("12"))
        {
                String newValue ="00";
                stringBuilder.replace(0,2,newValue);
                stringBuilder.replace(8,10," ");
        }
        else if (s.contains("AM") && !s.contains("12"))
        {
            stringBuilder.replace(8,10," ");
        }
        else if (s.contains("PM") && s.contains("12"))
        {
            stringBuilder.replace(8,10," ");
        }
        System.out.println(stringBuilder.toString());

    }
}
