package Solve_Problem_Notes.bj_7월;

import java.util.Scanner;

public class bj1568 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int bird = 1;
        int count = 0;

        while (n >= 1) {
            if (n < bird) {
                bird = 1;
            }
            n -= bird;
            bird++;
            count++;
        }

        System.out.print(count);

    }

}
