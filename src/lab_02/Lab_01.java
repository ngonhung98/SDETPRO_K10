package lab_02;

import java.util.Scanner;

public class Lab_01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter your weight:");
        int yourWeight= scanner.nextInt();
        System.out.print("Please enter your height:");
        float yourHeight= scanner.nextFloat();
        float BMI= yourWeight/(yourHeight*2);
        //Underweight
        if(BMI<=18.8)
        {
            System.out.print("Underweight!");
        }
        //Normal weight
        if(BMI>18.5&&BMI<=24.9)
        {
            System.out.print("Normal weight!");
        }
        //Overweight
        if(BMI>25&&BMI<=29.9)
        {
            System.out.print("Overweight!");
        }
        //Obesity
        if(BMI>=30) {
            System.out.print("Obesity!");
        }
    }
}
