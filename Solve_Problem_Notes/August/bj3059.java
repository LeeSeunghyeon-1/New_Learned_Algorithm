package Solve_Problem_Notes.August;

import java.util.Scanner;

public class bj3059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String strArr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] str = strArr.split("");
        for (int i = 0; i < n; i++) {
            String ch = sc.next();
            int charSum = 0;
            for (int j = 0; j < str.length; j++) {
                if (!ch.contains(str[j])) {
                    charSum += strArr.charAt(j);
                }
            }
            System.out.println(charSum);
        }
    }

}
