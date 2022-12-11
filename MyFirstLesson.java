import jdk.nio.mapmode.ExtendedMapMode;

import java.awt.desktop.ScreenSleepEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class MyFirstLesson{
    public static void main(String[] args) {

        // ПЕРВЫЙ УРОК

        //Самая первая задача (первого урока)

//        Scanner in = new Scanner(System.in);
//        int height = in.nextInt(), waist = in.nextInt();
//        System.out.println("Is it Male or Female?: ");
//        String gender  = in.next();
//        int bodyFat = 64-(20*(height/waist));
//        if(Objects.equals(gender, "Female")){
//            bodyFat = 76-(20*(height/waist));
//            System.out.println("Процент жира в теле для женщины: " + bodyFat);
//        }else if(Objects.equals(gender, "Male")){
//            System.out.println("Процент жира в теле для мужчины: " + bodyFat);
//        }else{
//            System.out.println("Неверный пол!");

        // ВТОРОЙ УРОК

//        Вторая задача (первая задача второго урока)

//        Scanner in = new Scanner(System.in);
//        double a = in.nextInt(), b = in.nextInt();
//        double c = (a+b)/2;
//        System.out.println(c);

//         Третья задача (вторая задача второго урока)

//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt(), b = in.nextInt();
//        int c = a % b;
//        System.out.println(c);

        // ТРЕТИЙ УРОК

        // 1 задача while
//        int a = 0;
//        while(a!=5){
//            a++;
//            System.out.println(a);
//        }

        // 1 задача for
//        for(int i = 1; i<6;i++){
//            System.out.println(i);
//        }

        // 2 задача while
//        int a = 5;
//        while(a!=0){
//            System.out.println(a);
//            a--;
//        }

        // 2 задача for
//        for(int i = 5; i>0;i--){
//            System.out.println(i);
//        }

        // 3 задача while
//        int a = 1;
//        while(a!=10){
//            System.out.println(a*3);
//            a++;
//        }
        // 3 задача for
//        for(int i = 1; i<10;i++){
//            System.out.println(i*3);
//        }

        // 4 задача while
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int sum = 0;
//        while(a!=0){
//            sum+=a;
//            a--;
//        }
//        System.out.println(sum);

        // 4 задача for
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int sum = 0;
//        for(int i = 1; i<=a;i++){
//            sum+=i;
//        }
//        System.out.println(sum);

        // ЧЕТВЕРТЫЙ УРОК

        // Первая задача
//        int[] arr = new int[99];
//        int c = 0;
//        for(int i = 0; i<99;i++){
//            if(i%2!=0){
//                arr[c] = i;
//                c++;
//            }
//        }
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i]==0){
//                break;
//            }
//            System.out.println(arr[i]);
//        }

        // Вторая задача
//        int[] arr = new int[20];
//        int c = 0;
//        for(int i = 2;i<21;i++){
//            if(i%2==0){
//                arr[c]=i;
//                c++;
//            }
//        }
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i]==0){
//                break;
//            }
//            System.out.println(arr[i]);
//        }

        // Третья задача
//        int[] arr = new int[20];
//        int c = 0;
//        int sum = 0;
//        for(int i = 2;i<21;i++){
//            if(i%2==0){
//                arr[c]=i;
//                c++;
//            }
//        }
//        for(int i = 0; i<arr.length;i++){
//            if(arr[i]==0){
//                break;
//            }
//            sum += arr[i];
//        }
//        System.out.println(sum);

        // ПЯТЫЙ УРОК

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите количество строк: ");
//        int n = in.nextInt();
//        System.out.println("Введите количество столбцов: ");
//        int m = in.nextInt();
//        int[][] arr = new int[n][m];
//        int min = 1000;
//        System.out.println("Введите сам массив: ");
//        for(int i = 0; i<n;i++){
//            for(int j = 0;j<m;j++){
//                arr[i][j] = in.nextInt();
//                if(arr[i][j] < min){
//                    min = arr[i][j];
//                }
//            }
//        }
//        System.out.println("Минимальное значение в этом массиве - " + min);

//        System.out.println(isUgly(6));

        // ПЯТЫЙ УРОК ДОМАШНЕЕ ЗАДАНИЕ

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[][] arr = new int[n][n];
//        int[][] arr2 = new int[n][n];
//        for(int i = 0; i<n;i++){
//            for(int j = 0; j<n;j++){
//                arr[i][j] = in.nextInt();
//            }
//        }
//        for(int i = 0; i<n;i++){
//            for(int j = 0; j<n;j++){
//                arr2[i][j] = in.nextInt();
//                arr2[i][j] += arr[i][j];
//            }
//        }
//        for(int i = 0; i<n;i++){
//            for(int j = 0; j<n;j++){
//                System.out.print(arr2[i][j] + " ");
//            }
//            System.out.println();
//        }

        // ШЕСТОЙ УРОК

//        Scanner in = new Scanner(System.in);
//        int a, b;
//        String sign = "";
//        String toStop = "";
//        while(true){
//            System.out.println("Enter first number:");
//            a = in.nextInt();
//            System.out.println("Enter second number:");
//            b = in.nextInt();
//            System.out.println("What do you want to do?(+, *, /, -):");
//            sign = in.next();
//            if(Objects.equals(sign, "+")){
//                System.out.println("Sum of entered numbers:" + sum(a, b));
//            }else if(Objects.equals(sign, "*")){
//                System.out.println("Product of entered numbers:" + multiply(a, b));
//            }else if(Objects.equals(sign, "/")){
//                System.out.println("Division of entered numbers:" + divide(a, b));
//            }else if(Objects.equals(sign, "-")){
//                System.out.println("Subtraction of entered numbers:" + subtract(a, b));
//            }
//            System.out.println("Do you want to continue calculating?(CONTINUE/STOP):");
//            toStop = in.next();
//            if(Objects.equals(toStop, "STOP")){
//                break;
//            }
//        }
//
//    }
//
//    static int sum(int a, int b){
//        return a + b;
//    }
//    static int multiply(int a, int b){
//        return a * b;
//    }
//    static float divide(float a, float b){
//        return a / b;
//    }
//    static int subtract(int a, int b){
//        return a - b;
//    }

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Please enter number of tasks you want to add to your list: ");
//        int numOfTasks = sc.nextInt();
//
//        String[] tasks = fillTaskList(numOfTasks);
//
//        boolean isRunnable = true;
//
//        while (isRunnable){
//            System.out.println("Here is your task list: ");
//            printTasklist(tasks);
//
//            System.out.println("Choose the index of task you want to mark as completed/uncompleted or enter '0' to end the program: ");
//
//            int index = sc.nextInt() - 1;
//
//            if(index == -1){
//                System.out.println("Thanks for using our app! Bye-bye!");
//                isRunnable = false;
//            }else{
//                changeTaksList(index, tasks);
//            }
//
//            if(checkIfAllTasksCompleted(tasks)){
//                isRunnable = false;
//            }
//
//        }
//
//    }
//
//    private static boolean checkIfAllTasksCompleted(String[] tasks){
//        for(int i = 0; i < tasks.length; i++){
//            if(!tasks[i].contains("Done")){
//                return false;
//            }
//        }
//        printTasklist(tasks);
//        System.out.println("Good job! You've completed all your tasks! Bye-bye!");
//        return true;
//    }
//
//    private static void changeTaksList(int index, String[] tasks){
//        if(index<tasks.length){
//            if(tasks[index].contains("Done")){
//                tasks[index] = tasks[index].substring(10);
//            }else{
//                tasks[index] = "(Done!) | " + tasks[index];
//            }
//        }else{
//            System.out.println("We are sorry! There is no task with such index!");
//        }
//
//    }
//
//    private static void printTasklist(String[] tasks){
//        for(int i = 0; i < tasks.length; i++){
//            System.out.println((i+1) + ". " + tasks[i]);
//        }
//    }
//
//    private static String[] fillTaskList(int numberOfTasks){
//        String[] taskList = new String[numberOfTasks];
//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < numberOfTasks; i++){
//            System.out.println("You still have " + (numberOfTasks - i) + " left");
//            System.out.println("Please enter the task name: ");
//            taskList[i] = sc.nextLine();
//        }
//        return  taskList;
//    }

        // СЕДЬМОЙ УРОК

//        MyFirstLesson game = new MyFirstLesson();
//        Scanner in = new Scanner(System.in);
//        String[] weapons = {"rock", "paper", "scissors"};
//        boolean isPlaying = true;
//        while (isPlaying){
//            game.greeting();
//            int randomValue = game.valueForComp();
//            String computerMove = weapons[randomValue];
//            String playerMove = in.next();
//            System.out.println("Computer's move: " + computerMove);
//            if(playerMove.equals(computerMove)){
//                System.out.println("Draw! Try again");
//            }else{
//                game.gameLogic(playerMove, computerMove);
//            }
//            if(game.ending().equals("no")){
//                System.out.println("Thank you for the game!");
//                isPlaying = false;
//            }
//        }
//    }
//
//    private void greeting(){
//        System.out.println("Welcome to 'Rock, Paper & Scissors' game!");
//        System.out.println("Let's start! Choose your weapon ('rock', 'paper', 'scissors'): ");
//    }
//    private int valueForComp(){
//        return (int) (Math.random()*2);
//    }
//    private void gameLogic(String playerMove, String computerMove){
//        if(playerMove.equals("scissors")){
//            if(computerMove.equals("paper")){
//                System.out.println("You won!");
//                return;
//            }
//            else{
//                System.out.println("You lost!");
//                return;
//            }
//        }else if(playerMove.equals("rock")){
//            if(computerMove.equals("scissors")){
//                System.out.println("You won!");
//                return;
//            }
//            else {
//                System.out.println("You lost!");
//                return;
//            }
//        }else if(playerMove.equals("paper")){
//            if(computerMove.equals("rock")){
//                System.out.println("You won!");
//                return;
//            }
//            else{
//                System.out.println("You lost!");
//                return;
//            }
//        }
//    }
//    private String ending(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Do you want to continue playing? (yes/no): ");
//        String isContinuing = in.next();
//        return isContinuing;
//    }
        
        System.out.println("Hello everyone!");
        
    }
}



