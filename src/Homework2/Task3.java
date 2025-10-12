package Homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner daxilEt = new Scanner(System.in);
        System.out.print("Bir eded daxil edin: ");
        int eded = daxilEt.nextInt();

        System.out.println("1-den " + eded + " qeder olan tek ededler: ");

        for (int i = 1; i <= eded; i++) {
            if (i % 2 != 0) { // ədədi 2-yə böləndə qalığı varsa, təkdir
                System.out.println(i);
            }
        }
    }
}
