package lab_06;

import java.util.Scanner;

public class Lab_02 {
    public static void main(String[] args) {

        int count = 1;
        checkpass(count);
    }

    public static void checkpass(int count){
        System.out.println("Moi nhap pass:");
        Scanner scanner = new Scanner(System.in);
        String myPass = scanner.next();
        if (count < 3) {
            if (myPass == "password123") {
                System.out.println("Chuc mung ban!");
            } else {
                count++;
                checkpass(count);
            }
        } else {
            System.out.println("Bạn nhập sai pass quá 3 lần");
        }
    }
}
