package Homework3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] ededler = {12,6,7,4,9};
        Arrays.sort(ededler); // artan sıraya görə çeşidləyirik

        System.out.println("Array artan sıra ilə:"); // nəticə
        for (int eded : ededler) {
            System.out.print(eded + " ");
        }
    }
}
