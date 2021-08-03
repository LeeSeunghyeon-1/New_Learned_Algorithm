package Solve_Problem_Notes.bj_7월;

import java.util.Scanner;

public class bj19944 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (arr[1] == 1 || arr[1] == 2) {
            System.out.print("NEWBIE!");
        } else if (arr[0] >= arr[1]) {
            System.out.print("OLDBIE!");
        } else
            System.out.println("TLE!");

    }

}
