package AlogorithmsAndDataStructures.RecursionHW;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = in.nextLine().toCharArray();
        int n = arr.length-1;
        everyVariant(arr, n);
    }

    public static void everyVariant(char[] arr, int n){
        if (n == -1) return;
        else{
            everyVariant(arr, n-1);
            for (int i = n; i >= 0; i--) {
                System.out.print(arr[i]);
            }
            if (n != arr.length-1){
                for (int i = n+1; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
            }
            System.out.print(" ");
        }
    }
}
