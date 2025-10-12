package Homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner daxilEt = new Scanner(System.in);
        System.out.print("Bir eded daxil edin: ");
        int eded = daxilEt.nextInt();

        int ededKopya = eded;
        int tersEded = 0;
        int reqemSayi = 0;

        int keciciEded = eded; // Ədədin tərsini tapıb, rəqəm sayını hesablayırıq
        while (keciciEded > 0) {
            int reqem = keciciEded % 10;
            tersEded = tersEded * 10 + reqem;
            keciciEded = keciciEded / 10;
            reqemSayi++;
        }

        boolean palindromdur = (eded == tersEded);
        boolean artandir = true;
        boolean azalandir = true;   // Rəqəmləri artan və azalan olub-olmadığını yoxlayırıq

        int evvelkiReqem = -1;
        int ededKopya2 = eded;
        int bolen = 1;

        int i = 1;     // Əvvəl böləni tapırıq ki, ən sol rəqəmdən başlaya bilək
        while (i < reqemSayi) {
            bolen = bolen * 10;
            i++;
        }

        i = 0;           // Soldan sağa doğru rəqəmləri müqayisə edirik
        while (bolen >= 10) {
            int solReqem = (ededKopya2 / bolen) % 10;
            int sagReqem = (ededKopya2 / (bolen / 10)) % 10;

            if (solReqem >= sagReqem) {
                artandir = false;
            }
            if (solReqem <= sagReqem) {
                azalandir = false;
            }

            bolen = bolen / 10;
            i++;
        }

        if (palindromdur) {
            System.out.println("Bu eded palindromdur.");
        } else if (artandir) {
            System.out.println("Bu ededin reqemleri artandır.");
        } else if (azalandir) {
            System.out.println("Bu ededin reqemleri azalandır.");
        } else {
            System.out.println("Budur.");
        }
    }
}
