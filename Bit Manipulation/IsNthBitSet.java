/*
Problem Statement: Given two numbers 'a' and 'n', check if nth bit is set in 'a'. Consider 0 based indexing.
Idea: Do a bitwise AND operation with 1 at the nth position. If the result is non-zero bit is set otherwise
it is unset.

Examples:

Input: 4 2
Output: Bit is unset at position 2

Input: 10 4
Output: Bit is set at position 4
 */

import java.util.Scanner;

public class IsNthBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        checkNthBit(a, n);
    }

    public static void checkNthBit(int a, int n) {
        if ((a & (1 << (n - 1))) != 0) {
            System.out.println("Bit is set at position " + n);
        } else {
            System.out.println("Bit is unset at position " + n);
        }
    }
}
