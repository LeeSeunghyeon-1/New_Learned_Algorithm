package Solve_Problem_Notes.bj_7월;

import java.util.Arrays;
import java.util.Scanner;

public class bj2693 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[7]);
        }
    }

}
