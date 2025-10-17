package Homework3;

public class Task9 {
    public static void main(String[] args) {
        String cumle = "Salam dünya";
        cumle = cumle.toLowerCase(); // kiçik hərflərə çeviririk


        int[] saylar = new int[26];

        for (int i = 0; i < cumle.length(); i++) { //Dövr ilə hərfləri yoxlayırıq
            char herf = cumle.charAt(i);
            if (herf >= 'a' && herf <= 'z') {
                saylar[herf - 'a']++;
            }
        }

        System.out.println("Hərflərin təkrarlanma sayı:"); // nəticə
        for (int i = 0; i < saylar.length; i++) {
            if (saylar[i] > 0) {
                System.out.println((char) (i + 'a') + " - " + saylar[i]);
            }
        }
    }
}
