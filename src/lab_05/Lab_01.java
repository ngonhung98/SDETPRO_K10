package lab_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_01 {

    public static void main(String[] args) {
        List<Integer> myArrayList;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game start");
        menuGame();
        System.out.println("Please choice your number you want:");
        int choice= scanner.nextInt();
        switch (choice){
            case 1:
                myArrayList = playGame();
                System.out.println(myArrayList);
                break ;
            case 2:
                getMaxNumber();
                break;
            case 3:
                getMinNumber();
                break;
        }
    }

    public static void menuGame() {
        System.out.print("----------MENU GAME-------------------\n");
        System.out.print("1. Add number into ArrayList and Print numbers\n");
        System.out.print("2. Get maximum number\n");
        System.out.print("3. Get minimum number");
    }

    public static List playGame() {
        List<Integer> myArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers that you want input:");
        int numbersArrayList = scanner.nextInt();
        for (int i = 0; i < numbersArrayList; i++) {
            System.out.print("Please enter the number" + (i + 1) + ":");
            int number = scanner.nextInt();
            myArrayList.add(number);
        }
        return myArrayList;
    }
    public static void getMaxNumber(){
        List<Integer> myArrayList;
        myArrayList=playGame();

    }
    public static void getMinNumber(){

    }
}
