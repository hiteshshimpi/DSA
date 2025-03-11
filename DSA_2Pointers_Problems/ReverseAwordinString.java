package DSA_2Pointers_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAwordinString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "Hitesh Shimpi";
        char chArray[]=new char[0];
        String[] word = s.split(" ");
        System.out.println("Spillted word is  : "+Arrays.toString(word));
        for (int i = 0; i < word.length; i++) {
            String ch = word[i];
            chArray = ch.toCharArray();
            int start = 0;
            int end =ch.length()-1;
            while(start<end)
            {
                char temp = chArray[start];
                chArray[start]=chArray[end];
                chArray[end]=temp;
                start++;
                end--;
            }
            sb.append(chArray);
            sb.append(" ");
        }
        System.out.println(sb);
        }
    }
