package Homework1;

public class Task4 {
    public static void main(String[] args) {
        Integer wrapperDeyisen = 102; // Integer wrapper dəyişəndir
        int primitiveDeyisen = wrapperDeyisen; // Unboxing prosesi gedir. Integer obyektindən int dəyəri çıxarırıq

        System.out.println("Integer deyisenimiz: " + wrapperDeyisen);
        System.out.println("Unboxingden sonra primitive int deyisenimiz: " + primitiveDeyisen);
    }
}
