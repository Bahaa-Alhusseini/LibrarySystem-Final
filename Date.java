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
public class Date  implements Serializable {
    private int day,month,year;

    public Date() {
        
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day >= 1 && day <= 30 ? day : 1;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month >= 1 && month <= 12 ? month : 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
    public Date dateDiff(Date other) {
        int d1 = this.day + this.month*30+this.year*365;
        int d2 = other.day + other.month*30+other.year*365;
        int daysDiff = Math.abs(d2-d1);
        Date diff = new Date(daysDiff%365%30, daysDiff%365/30, daysDiff/365);
        return diff;
    }
}
