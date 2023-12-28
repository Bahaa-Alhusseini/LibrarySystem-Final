/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarySystem;

/**
 *
 * @author Bahaa
 */
public class Journal extends Book {
    private String conferenceName;
    private int conferenceNumber;

    public Journal(String title, String author, String bnum, int copies, 
                   String conferenceName, int conferenceNumber) {
        super(title, author, bnum, copies);
        this.conferenceName = conferenceName;
        this.conferenceNumber = conferenceNumber;
    }

    
    public String getConferenceName() {
        return conferenceName;
    }

    public int getConferenceNumber() {
        return conferenceNumber;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public void setConferenceNumber(int conferenceNumber) {
        this.conferenceNumber = conferenceNumber;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Conference Name: " + conferenceName + ", Conference Number: " + conferenceNumber;
    }
}