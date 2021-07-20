package Solve_Problem_Notes;

import java.util.Scanner;

public class bj19698 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();
        int L = sc.nextInt();

        int realW = W / L;
        int realH = H / L;

        int mul = realW * realH;

        if (mul > N) {
            System.out.println(N);
        }
        System.out.println(mul);

    }

}
