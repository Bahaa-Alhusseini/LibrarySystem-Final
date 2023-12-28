/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarySystem;


import java.io.Serializable;
/**
 *
 * @author Bahaa
 */

  // implements Display
public class Book  implements Serializable {
    private String title;
    private String author;
    private String bnum;
    private int copies;
    private boolean isLoaned;

    
    public Book(){
        
    }
   
    
    
    public Book(String title, String author, String bnum, int copies) {
        this.title = title;
        this.author = author;
        this.bnum = bnum;
        this.copies = copies;
        this.isLoaned = false; 
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getbnum() {
        return bnum;
    }

    public int getCopies() {
        return copies;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setbnum(String bnum) {
        this.bnum = bnum;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    public boolean isAvailable() {
        return copies > 0 && !isLoaned; // A book is available if there are copies left and it is not currently loaned
    }
    
    
     public void loanOut() {
        if (isAvailable()) {
            isLoaned = true;
            copies--; // Decrease the available copies
        }
    }
    
    
   public void returnBook() {
        isLoaned = false;
        copies++; // Increase the available copies
    }
    
    
    
    
    public String getInfo() {
        return "Title: " + title + ", Author: " + author + ", bnum: " + bnum +
               ", Copies: " + copies + ", Loaned: " + (isLoaned ? "Yes" : "No")  ;
    }

    public boolean inLoan() {
        return isLoaned;
    }
}

    // Assuming loan.getBook() returns a Book object and you have isLoaned() method in Book class.
    
    