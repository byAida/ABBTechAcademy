package Homework1;

public class Task2 {
    public static void main(String[] args) {
       int primitivdeyisen = 15;
       Integer wrapperdeyisen = primitivdeyisen; // Burada biz autoboxing edirik (avtomatik çevrilmə)

        System.out.println("Primitive deyisenimiz: " + primitivdeyisen);
        System.out.println("Wrapper deyisenimiz autoboxinden sonra: " + wrapperdeyisen); // Nəticə eyni olacaq amma ikinci dəyişən artıq obyekt tipindədir.
    }
}
