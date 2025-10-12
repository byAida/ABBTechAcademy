package Homework2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner daxilEt = new Scanner(System.in);
        System.out.print("Neçə Fibonacci ədədi çap edilsin: ");
        int say = daxilEt.nextInt();

        if (say <= 0) {
            System.out.println("Zəhmət olmasa düzgün ədəd daxil edin.");
        } else {
            int birinci = 0;
            int ikinci = 1;
            int i = 0;  // İstifadəçinin daxil etdiyi ədədi yoxlayırıq

            while (i < say) {
                int cari;

                if (i == 0) {
                    cari = birinci;
                } else if (i == 1) {
                    cari = ikinci;
                } else {
                    cari = birinci + ikinci;
                    birinci = ikinci;
                    ikinci = cari;
                }

                if (cari % 2 == 0) { // Yoxlamaq hisssəsi təkdir ya cüt
                    System.out.println(cari + " - cütdür");
                } else {
                    System.out.println(cari + " - təkdir");
                }

                i++;
            }
        }
    }
    }
