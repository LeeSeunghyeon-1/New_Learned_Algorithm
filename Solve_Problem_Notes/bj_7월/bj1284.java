package Solve_Problem_Notes.bj_7월;

import java.util.Scanner;

public class bj1284 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sum = 2;
            String str = sc.next();
            if (str.charAt(0) == '0')
                break;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    sum += 2;
                } else if (str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5'
                        || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8'
                        || str.charAt(i) == '9') {
                    sum += 3;
                } else if (str.charAt(i) == '0') {
                    sum += 4;
                }
            }
            sum += str.length() - 1;
            System.out.println(sum);
        }

    }

}
