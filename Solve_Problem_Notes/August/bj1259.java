package Solve_Problem_Notes.August;

import java.util.Scanner;

public class bj1259 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            String result = "";
            if (str.equals("0")) {
                break;
            }
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            if (str.equals(result)) {
                System.out.println("yes");
            } else
                System.out.println("no");

        }
    }

}
