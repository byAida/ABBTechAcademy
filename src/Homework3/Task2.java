package Homework3;

public class Task2 {
    public static void main(String[] args) {
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int esasDiaqonalCem = 0; //matrisi və diaqonalları elam etdik ölçüsünü aldıq
        int komekciDiaqonalCem = 0;
        int olcu = matris.length;

        for (int i = 0; i < olcu; i++) { // dövr vastitəsilə hesablayırıq
            esasDiaqonalCem += matris[i][i];
            komekciDiaqonalCem += matris[i][olcu - 1 - i];
        }

        System.out.println("Əsas diaqonalın cəmi: " + esasDiaqonalCem);  // nəticə
        System.out.println("Köməkçi diaqonalın cəmi: " + komekciDiaqonalCem);
    }
}
