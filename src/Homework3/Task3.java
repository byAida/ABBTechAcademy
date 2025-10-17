package Homework3;

public class Task3 {
    public static void main(String[] args) {
        int[][][] array3D = { // massivi elan etdik
                {
                        {1, 7, 3},
                        {6, 8, 2}
                },
                {
                        {5, 9, 0},
                        {4, 10, 6}
                }
        };

        System.out.println("6-dan böyük ədədlər:");

        for (int i = 0; i < array3D.length; i++) { // Üçlü dövr vasitəsilə elementləri yoxlayırıq
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    if (array3D[i][j][k] > 6) {
                        System.out.println(array3D[i][j][k]);
                    }
                }
            }
        }
    }
}
