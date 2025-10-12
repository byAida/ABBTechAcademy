package Homework2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner daxilEt = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int eded = daxilEt.nextInt();

        int ilkinEded = eded; // Əsas ədədi saxlayırıq
        int cəm = 0; // Faktorial cəmi üçün dəyişən


        while (eded > 0) {
            int reqem = eded % 10; // Axırıncı rəqəm
            int faktoriyal = 1;
            int i = 1;

            while (i <= reqem) {  // Rəqəmin faktorialını hesablayırıq
                faktoriyal = faktoriyal * i;
                i++;
            }

            cəm = cəm + faktoriyal;
            eded = eded / 10;
        }

        if (cəm == ilkinEded) { // Cəmi əsas ədədlə müqayisə edirik
            System.out.println("Bu ədəd Strong numberdir.");
        } else {
            System.out.println("Bu ədəd Strong number deyil.");
        }
    }
}
