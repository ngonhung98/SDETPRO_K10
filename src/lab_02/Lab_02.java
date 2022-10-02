package lab_02;

import java.util.Scanner;

public class Lab_02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter number:");
        int myNumber= scanner.nextInt();
        //odd number
        if (myNumber%2==0){
            System.out.print("It's a odd number!");
        }
        //even number
        else {
            System.out.print("It's a even number!");
        }
    }
}
