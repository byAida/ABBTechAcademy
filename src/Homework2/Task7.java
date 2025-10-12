package Homework2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner daxilEt = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int eded = daxilEt.nextInt();

        if (eded < 0) { // Əgər daxil edilən ədəd mənfidirsə, xəbərdarlıq veririk
            System.out.println("Mənfi ədədlər üçün faktorial mövcud deyil.");
        } else {
            int faktoriyal = 1;
            int i = 1;

            while (i <= eded) {
                faktoriyal = faktoriyal * i;
                i++;
            }
            System.out.println("Faktorial: " + faktoriyal);
        }
    }
}
