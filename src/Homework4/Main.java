package Homework4;

public class Main {
    public static void main(String[] args) {
        // Yeni kitab yaratdım
        Book b1 = new Book("Kimyagər", "Paulo Coelho", "16081602");

        // Məlumatı çap etmək üçün
        b1.printInfo();

        // Kitabı götürmək
        b1.borrowBook();
        b1.printInfo();

        // Kitabı qaytarmaq
        b1.returnBook();
        b1.printInfo();

        // Qaydalar və kitab tipi də burada
        Book.libraryRules();
        b1.bookType();
    }
}
