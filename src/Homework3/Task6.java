package Homework3;

public class Task6 {
    public static void main(String[] args) {
        int[] ededler = {12,6,7,4,9};
        int uzunluq = ededler.length;

        for (int i = 0; i < uzunluq - 1; i++) { //azalan sıra ilə düzürük
            for (int j = 0; j < uzunluq - 1 - i; j++) {
                if (ededler[j] < ededler[j + 1]) {
                    int temp = ededler[j];
                    ededler[j] = ededler[j + 1];
                    ededler[j + 1] = temp;
                }
            }
        }

        System.out.println("Tərsinə sort edilmiş array:");
        for (int eded : ededler) {
            System.out.print(eded + " ");
        }
    }
}
