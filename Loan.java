/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarySystem;

/**
 *
 * @author Bahaa
 */
import java.time.LocalDate;


public class Loan {
    private Student student;
    private Book book;
    private LocalDate loanDate;
    private LocalDate dueDate;
    


   public Loan(Student student, Book book, LocalDate loanDate, LocalDate dueDate) {
        this.student = student;
        this.book = book;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
    }

    
    public Student getStudent() {
        return student;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }
    
    
    
    public void setStudent(Student student) {
        this.student = student;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    
    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }

   
}

