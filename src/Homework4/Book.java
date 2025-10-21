package Homework4;

public class Book {

    // fieldsələri qeyd etdim access modifiers ilə
    private String title;
    private String author;
    private String isbn;
    protected int totalCopies;
    protected int availableCopies;

    // kitab sinfinin konstruktorunu yaratdım
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.totalCopies = 1;
        this.availableCopies = 1;
    }

     // hər kitab yaradılanda mesaj çap olunsun deyə initializer blokla yazdım

    {
        System.out.println("New book created!");
    }

    // Kitabı götürmək üçün metod yaratdım şərtlər daxilində
    public void borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, no copies available.");
        }
    }

    // Kitabı qaytarmaq üçün metoda saldım
    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("All copies are already in the library.");
        }
    }

    // Kitab haqqında məlumatları çap etmək üçün metod yaradıb çapa verdim
    public void printInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Total Copies: " + totalCopies);
        System.out.println("Available Copies: " + availableCopies);
    }

    // statik metod yaratdım
    public static void libraryRules() {
        System.out.println("Max 3 books can be borrowed per person.");
    }

    // sonda final metod
    public final void bookType() {
        System.out.println("This is a regular book.");
    }
}
