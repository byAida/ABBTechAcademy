package Homework3;

public class Task1 {
    public static void main(String[] args) {
        int[] ededler = {8, 12, -6, 7, -25, 13, 9,-10}; // massivi yazıb ilk elementi ən kiçik və ən böyük ədəd kimi qeyd edirik
        int enKicik = ededler[0];
        int enBoyuk = ededler[0];

        for (int i = 1; i < ededler.length; i++) { // ədədləri yoxlayırıq
            if (ededler[i] < enKicik) {
                enKicik = ededler[i];
            }
            if (ededler[i] > enBoyuk) {
                enBoyuk = ededler[i];
            }
        }

        System.out.println("Ən kiçik ədəd: " + enKicik); // neticeler
        System.out.println("Ən böyük ədəd: " + enBoyuk);
    }
}
