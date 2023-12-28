/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarySystem;

/**
 *
 * @author Bahaa
 */
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books; // Using book number (bnum) as key for quick lookups

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getbnum(), book);
    }

    public Book searchByTitle(String title) {
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book searchByBookNumber(String bnum) {
        return books.get(bnum);
    }
     public void loadBooksFromFile(String filename) {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
        // Read serialized books from the file until EOF is reached
        while (true) {
            try {
                Book book = (Book) ois.readObject();
                this.books.put(book.getbnum(), book); // Add book to the map using bnum as key
            } catch (EOFException eof) {
                // End of file reached
                break;
            } catch (ClassNotFoundException cnfe) {
                // Handle error - class not found for a serialized object
                cnfe.printStackTrace();
                break;
            }
        }
    } catch (IOException e) {
        // Handle other I/O errors
        e.printStackTrace();
    }
}

    public boolean returnBook(Book book) {
        // Assuming book is the actual Book object (not a copy or a new instance)
        if (book != null && books.containsKey(book.getbnum()) && book.isLoaned()) {
            book.returnBook(); // This method will set isLoaned to false and increment copies
            return true;
        }
        return false;
    }

    // Other Library methods as needed, like loaning out books, etc.
}