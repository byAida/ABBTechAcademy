package Homework6;

public class Main {
    public static void main(String[] args) {
        Library<Library.Section> library = new Library<>();

        // Bölmələr

        Library.Section fiction = new Library.Section("Fiction");
        Library.Section science = new Library.Section("Science");

        // Kitablar

        Library.Book book1 = library.new Book("Azerbaycan dili", "Ali Mammadov", 2004);
        Library.Book book2 = library.new Book("İngilis dili", "Nermin İsgenderli", 2009);
        Library.Book book3 = library.new Book("Alman dili", "Yusif İlyasov", 2018);

        // Kitabları bölmələrə əlavə etmək üçün

        fiction.addBook(book1);
        fiction.addBook(book2);
        science.addBook(book3);

        // Kitabları göstərmək üçün

        library.addSection(fiction);
        library.addSection(science);
        library.displayAllSections();

        // Kitablara filtr tətbiq etmək üçün isə

        System.out.println("Filtered Books:");
        library.filterBooks(new Library.BookFilter() {
            @Override
            public boolean filter(Library.Book book) {
                return book.year > 2000;
            }
        });
    }
}

