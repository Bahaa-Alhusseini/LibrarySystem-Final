/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarySystem;

import java.io.Serializable;
import java.util.Iterator;

/**
 *
 * @author Bahaa
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 2L;
    private int id;
    private String name;
    private String address;
    private Date birthDate;
    private String major;
     private int bookCount = 0;
    private Book[] loanedBooks = new Book[3];

    
    public Student(int id, String name, String address, Date birthDate, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
        this.major = major;
        this.loanedBooks = new Book[3];
        this.bookCount = 0;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getMajor() {
        return major;
    }

    public Book[] getLoanedBooks() {
        return loanedBooks;
    }

    public int getBookCount() {
        return bookCount;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

   
    public void returnBook(Book book) {
    for (int i = 0; i < loanedBooks.length; i++) {
        if (loanedBooks[i] != null && loanedBooks[i].equals(book)) {
            loanedBooks[i] = null; // Remove the book from the array by setting it to null
            
            // Shift remaining books left by one position
            for (int j = i; j < loanedBooks.length - 1; j++) {
                loanedBooks[j] = loanedBooks[j + 1];
            }
            // Ensure the last spot is null if we moved books left
            loanedBooks[loanedBooks.length - 1] = null;
            
            bookCount--; // Decrement the book count
            break; // Exit the loop after removing the book
        }
    }
}
    public boolean hasBook(Book book) {
    for (Book borrowedBook : this.loanedBooks) {
        if (borrowedBook != null && borrowedBook.equals(book)) {
            return true;
        }
    }
    return false;
}
    
      public boolean loanBook(Book book) {
        // Check if the student can loan more books and if the book is available
        if (canLoan() && book.isAvailable()) {
            loanedBooks[bookCount] = book; // Add the book to the array of loaned books
            bookCount++;                   // Increment the count of books loaned
            book.loanOut();                // Mark the book as loaned out
            return true;
        }
        return false;  // Return false if the book can't be loaned
    }
    
    public boolean canLoan() {
        
        return bookCount < 3; 
}
    
     
     
    public String getInfo() {
        return "Student ID: " + id + "\nName: " + name + "\nAddress: " + address
                + "\nBirth Date: " + birthDate.toString() + "\nMajor: " + major;
    }
    
   
  
}
