

public class Date {

    private int month;
    private int year;
    private int day;


    public Date(int month, int year, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public void setDay(int day) {
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
       return year;
    }
    public String displayDate(int day, int month, int year) {
        String display = day + "/" + month + "/" + year; 
        return display;
    }

} // end class Date