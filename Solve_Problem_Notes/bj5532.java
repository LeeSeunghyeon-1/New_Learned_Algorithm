package Solve_Problem_Notes;

import java.util.Scanner;

public class bj5532 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int k = array[1] / array[3];
        int k_n = array[1] % array[3];
        int m = array[2] / array[4];
        int m_n = array[2] % array[4];

        if (k_n != 0 && m_n != 0) {
            k += 1;
            m += 1;
        }

        if (k >= m) {
            array[0] -= k;
        } else
            array[0] -= m;

        System.out.print(array[0]);
    }

}
