package Homework3;

public class Task5 {
    public static void main(String[] args) {
        int[] ededler = {12,6,7,4,9}; //elan etdik
        System.out.println("Array-in tərs versiyası:");


        for (int i = ededler.length - 1; i >= 0; i--) { //loop-a salıb tərs çap edirik
            System.out.print(ededler[i] + " ");
        }
    }
}
