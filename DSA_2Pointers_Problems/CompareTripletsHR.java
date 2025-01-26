package DSA_2Pointers_Problems;

import java.util.Scanner;

public class CompareTripletsHR {
    public static void main(String[] args) {
        int[] alice = new int[3];
        int[] bob = new int[3];
        int aliceResult = 0;
        int bobResult = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <alice.length; i++) {
            System.out.println("Enter ALICE Challenge Points : ");
            alice[i] = in.nextInt();
        }
        for (int i = 0; i < bob.length; i++) {
            System.out.println("Enter BOB Challenge Points");
            bob[i] = in.nextInt();
        }
        for (int j = 0; j < alice.length; j++) {
            if (alice[j] > bob[j]) {
                aliceResult = aliceResult + 1;
            } else if (alice[j] < bob[j]) {
                bobResult = bobResult + 1;
            }
        }
        System.out.println(aliceResult +" "+bobResult);
    }
}
