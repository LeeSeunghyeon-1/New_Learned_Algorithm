package Solve_Problem_Notes.August;

import java.util.Scanner;

public class bj5575 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            int[] arr = new int[6];
            for (int z = 0; z < arr.length; z++) {
                arr[z] = sc.nextInt();
            }

            if (arr[5] < arr[2]) {
                arr[4] -= 1;
                arr[5] = 60 + arr[5] - arr[2];
                if (arr[4] < arr[1]) {
                    arr[3] -= 1;
                    arr[4] = 60 + arr[4] - arr[1];
                } else if (arr[4] >= arr[1]) {
                    arr[4] = arr[4] - arr[1];
                }
            } else if (arr[5] >= arr[2]) {
                arr[5] = arr[5] - arr[2];
                if (arr[4] < arr[1]) {
                    arr[3] -= 1;
                    arr[4] = 60 + arr[4] - arr[1];
                } else if (arr[4] >= arr[1]) {
                    arr[4] = arr[4] - arr[1];
                }
            }
            arr[3] = arr[3] - arr[0];
            System.out.println(arr[3] + " " + arr[4] + " " + arr[5]);

        }

    }
}