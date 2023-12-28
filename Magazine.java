/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarySystem;

/**
 *
 * @author Bahaa
 */
public class Magazine extends Book {
    private int issueNumber;
    private String releaseDate;

    public Magazine(String title, String author, String bnum, int copies, 
                    int issueNumber, String releaseDate) {
        super(title, author, bnum, copies);
        this.issueNumber = issueNumber;
        this.releaseDate = releaseDate;
    }

    
    public int getIssueNumber() {
        return issueNumber;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Issue Number: " + issueNumber + ", Release Date: " + releaseDate;
    }
}