package AlogorithmsAndDataStructures.RecursionHW;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        reverseOrderStrings(n);
    }

    public static void reverseOrderStrings(int n){
        Scanner in = new Scanner(System.in);
        String[] arr = new String[n];
        if (n == 0) return;
        else{
            arr[n-1] = in.nextLine();
            reverseOrderStrings(n-1);
            System.out.print(arr[n-1] + " ");
        }
    }
}
