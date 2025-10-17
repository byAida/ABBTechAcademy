package Homework3;

public class Task7 {
    public static void main(String[] args) {
        String soz = "ABBTechAcademy";
        String tersSoz = ""; // boş string yaradırıq ki tərs çap edə bilək

        for (int i = soz.length() - 1; i >= 0; i--) { // dövr ilə geriyə doğru yazırıq
            tersSoz += soz.charAt(i);
        }

        System.out.println("Tərsinə çevrilmiş string: " + tersSoz); // nəticə
    }
}