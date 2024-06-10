package SDA;

 import java.util.Scanner;

public class BookFilterer {

    static class Book {
        String title;
        String author;
        int publicationYear;

        public Book(String title, String author, int publicationYear) {
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = {
            new Book("Atomic Habits", "James Clear", 2018),
            new Book("Ikigai", "Héctor García", 2016),
            new Book("48 Laws of Power", "Robert Greene", 1998)
        };

        System.out.print("Enter the filter year: ");
        int filterYear = scanner.nextInt();

        System.out.println("Books published after " + filterYear + ":");
        Book[] filteredBooks = filterByYear(books, filterYear);
        sortByYear(filteredBooks);
        printBooks(filteredBooks);
    }

    public static Book[] filterByYear(Book[] books, int filterYear) {
        int count = 0;
        for (Book book : books) {
            if (book.publicationYear >= filterYear) {
                count++;
            }
        }

        Book[] filteredBooks = new Book[count];
        int index = 0;
        for (Book book : books) {
            if (book.publicationYear >= filterYear) {
                filteredBooks[index++] = book;
            }
        }

        return filteredBooks;
    }

    public static void sortByYear(Book[] books) {
        int n = books.length;
        for (int i = 1; i < n; ++i) {
            Book key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].publicationYear > key.publicationYear) {
                books[j + 1] = books[j];
                j = j - 1;
            }
            books[j + 1] = key;
        }
    }

    public static void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author + " (" + book.publicationYear + ")");
        }
    }
}
