package Homework6;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Library.Section> {
    private List<T> sections;

    public Library() {
        sections = new ArrayList<>();
    }

    public void addSection(T section) {
        sections.add(section);
    }

    public void displayAllSections() {
        for (T section : sections) {
            System.out.println("Section: " + section.name);
            section.displayBooks();
        }
    }

    // Book adlı non-static inner class yaratdım
    public class Book {
        private String title;
        private String author;
        int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Book{title='" + title + "', author='" + author + "', year=" + year + "}";
        }
    }

    // Section adlı static nested class yaratdım
    public static class Section {
        String name;
        List<Library.Book> books;

        public Section(String name) {
            this.name = name;
            this.books = new ArrayList<>();
        }

        public void addBook(Library.Book book) {
            books.add(book);
        }

        public void displayBooks() {
            for (Library.Book book : books) {
                System.out.println(book);
            }
        }
    }

    // BookFilter adlı interfeys yaratdım
    public interface BookFilter {
        boolean filter(Library.Book book);
    }

    // filterBooks adlı metod yaratdım
    public void filterBooks(BookFilter filter) {
        for (T section : sections) {
            for (Library.Book book : section.books) {
                if (filter.filter(book)) {
                    System.out.println(book);
                }
            }
        }
    }
}

