package Homework2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner daxilEt = new Scanner(System.in);
        System.out.println("Yaşınızı daxil edin:");
        int yas = daxilEt.nextInt();
        System.out.println("Cinsinizi daxil edin (1 - kişi, 2 - qadın):");
        int cins = daxilEt.nextInt();  //İstifadəçi hissəsində yaş və qadın/kişi olduğunu soruşuruq


        if (yas < 18) {   // Yaş və cinsi yoxlayırıq
            System.out.println("Giriş rədd edildi!");
        } else {
            if (cins == 1) {
                System.out.println("Kişi üçün giriş icazəsi verildi");
            } else if (cins == 2) {
                System.out.println("Qadın üçün giriş icazəsi verildi");
            } else {
                System.out.println("Düzgün cins daxil edilməyib");
            }
        }
    }
}
