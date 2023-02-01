package AlogorithmsAndDataStructures.RecursionHW;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printReverseOrder(n);
    }

    public static void printReverseOrder(int n){
        Scanner in = new Scanner(System.in);
        if (n == 0) return;
        else{
            int b = in.nextInt();
            printReverseOrder(n-1);
            System.out.print(b + " ");
        }
    }
}
