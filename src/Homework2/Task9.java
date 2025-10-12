package Homework2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner daxilEt = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int eded = daxilEt.nextInt();

        int ilkinEded = eded; // Əsas ədədi saxlayırıq
        int reqemSayi = 0;
        int keciciEded = eded;

        while (keciciEded > 0) { // Ədədin rəqəmlərinin sayını tapırıq
            keciciEded = keciciEded / 10;
            reqemSayi++;
        }

        int cəm = 0;
        keciciEded = eded;


        while (keciciEded > 0) { // Hər rəqəmi ayırıb, qüvvətə yüksəldib cəmləyirik
            int reqem = keciciEded % 10;


            int quvvet = 1; // Qüvvətə yüksəltmək üçün döngü
            int i = 0;
            while (i < reqemSayi) {
                quvvet = quvvet * reqem;
                i++;
            }

            cəm = cəm + quvvet;

            keciciEded = keciciEded / 10;
        }


        if (cəm == ilkinEded) { // Cəmi əsas ədədlə müqayisə edirik
            System.out.println("Bu ədəd Armstrong ədədidir.");
        } else {
            System.out.println("Bu ədəd Armstrong ədədi deyil.");
        }
    }
}
