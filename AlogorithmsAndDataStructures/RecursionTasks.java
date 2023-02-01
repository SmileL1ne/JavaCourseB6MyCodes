package AlogorithmsAndDataStructures;

public class RecursionTasks {

    public static void main(String[] args) {
        System.out.println(powerNumSum(4, 3));
    }

    public static int powerNumSum(int b, int n){
        if (n == 0) return (int) Math.pow(b, n);
        else{
            return (int) Math.pow(b, n) + powerNumSum(b, n-1);
        }
    }
}
