package Solve_Problem_Notes.July;

import java.util.Scanner;
import java.math.BigInteger;
// BigInt 범위 :  -9 223 372 036 854 775 808부터 +9 223 372 036 854 775 807

public class bj14928 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num = sc.nextBigInteger();
        System.out.println(num.remainder(BigInteger.valueOf(20000303)));
    }

}
