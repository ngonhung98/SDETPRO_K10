package lab_06;

import java.util.Scanner;

public class Lab_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so gio:");
        int hrs = scanner.nextInt();
        System.out.print("Nhap so phut:");
        int mns = scanner.nextInt();
        int hrsToMns=hrs*60;
        int sumMns=hrsToMns+mns;
        System.out.println("So phut la:"+sumMns);

    }
}
