package Homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner daxilEt = new Scanner(System.in);
        System.out.print("1 ilə 7 arasında bir eded daxil edin: ");  // İstifadəçi tərəfi buradır.
        int eded = daxilEt.nextInt();

        String gun;    // Şərtə uyğun olaraq if-else yerinə, switch-case istifadə edirik. Sabit dəyərlər üçün daha yaxşı seçimdir
        switch (eded) {
            case 1:
                gun = "Bazar ertesi";
                break;
            case 2:
                gun = "Cersenbe axsami";
                break;
            case 3:
                gun = "Cersenbe";
                break;
            case 4:
                gun = "Cume axsami";
                break;
            case 5:
                gun = "Cume";
                break;
            case 6:
                gun = "Senbe";
                break;
            case 7:
                gun = "Bazar";
                break;
            default:
                gun = "Yanlış ədəd daxil etdiniz! Zəhəmt olmasa, yenidən sınayın";
        }

        System.out.println("Bu gun heftenin bu gunudur: " + gun);
    }
}
