import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Date {
    private int date;
    private int month;
    private int year;

    public void setDate(int d){
        this.date=d;
    }
    public int getDate(){
        return this.date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    Date(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;

    }

    @Override
    public String toString() {
       String display= String.format("%d/%d/%d",date,month,year);
       return display;
    }


}
