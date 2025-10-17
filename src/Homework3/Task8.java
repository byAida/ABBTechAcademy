package Homework3;

public class Task8 {
    public static void main(String[] args) {
        String soz = "ana";
        String tersSoz = "";

        for (int i = soz.length() - 1; i >= 0; i--) { //// Dövr ilə tərs string yaradırıq
            tersSoz += soz.charAt(i);
        }
        if (soz.equals(tersSoz)) {
            System.out.println(soz + " palindromedur.");
        } else {
            System.out.println(soz + " palindrome deyil.");
        }
    }
}
