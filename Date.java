

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
        this.day = day; 
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        if (day > 31)
            ;
        if (day < 1)
            ;
        return day;
    }
    public int getMonth() {
        if (month > 12)
            ;
        if (month < 1)
            ;
        return month;
    }
    public int getYear() {
        if (year > 1900)
            return year;
    }

}