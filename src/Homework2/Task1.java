package Homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir rəqəm daxil edin: "); // Burada istifadəçidən məlumat gözləyirik
        int reqem = sc.nextInt();

        if (reqem > 0) {
            System.out.println("Daxil etdiyiniz rəqəm müsbətdir");   // Şərti if vasitəsilə yoxlayırıq
        } else if (reqem < 0) {
            System.out.println("Daxil etdiyiniz rəqəm mənfidir");
        } else {
            System.out.println("0 ədədini daxil etmisiniz");
        }
    }
}
