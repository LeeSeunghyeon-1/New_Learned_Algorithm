package Solve_Problem_Notes;

import java.util.Scanner;

public class bj1712 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int count = -1;
        if (arr[1] < arr[2]) {

            System.out.println((arr[2] - arr[1]) / arr[0] + 1);

        } else
            System.out.println(count);

    }

}
