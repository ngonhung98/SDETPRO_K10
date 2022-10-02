package lab_02;

import java.util.Scanner;

public class Lab_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight:");
        int yourWeight = scanner.nextInt();
        System.out.print("Please enter your height:");
        float yourHeight = scanner.nextFloat();
        double BMI = yourWeight / (yourHeight * 2);
        double maxWeight;
        double minWeight;
        //Overweight
        if (BMI > 24.9) {
            maxWeight= yourWeight - 24.9*2*yourHeight;
            minWeight = yourWeight - 18.5*2*yourHeight;
            System.out.print("You need to gain from "+minWeight + " to " + maxWeight+" kg to reach normal weight!");
        }
        //Underweight
        else if (BMI < 18.5) {
            maxWeight= yourWeight - 24.9*2*yourHeight;
            minWeight = yourWeight - 18.5*2*yourHeight;
            System.out.print("You need to lose from "+(0-minWeight) + " to " + (0-maxWeight)+" kg to reach normal weight!");
        }
        //Normal weight
        else {
            System.out.print("You are at your normal weight!");
        }
    }
}
