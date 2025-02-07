package DSA_2Pointers_Problems;

public class AngryProfessor {
    public static void main(String[] args) {
        int[] arrival = {-2, -1,0, 2, 1};
       // -1 -3 4 2
        int k = 2;
        int students_on_time = 0;

        for (int i = 0; i < arrival.length; i++) {
            if (arrival[i] <= 0) {
                students_on_time += 1;
            }
        }
        if (students_on_time < k) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}