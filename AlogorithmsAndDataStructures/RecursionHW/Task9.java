package AlogorithmsAndDataStructures.RecursionHW;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (powerOfTwo(n)) System.out.println(n + " is a power of two");
        else System.out.println(n + " is not a power of two");
    }

    public static boolean powerOfTwo(int n){
        if (n == 1) return true;
        else if (n % 2 != 0) return false;
        else return powerOfTwo(n/2);
    }
}
