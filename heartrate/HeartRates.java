import java.time.Year;

public class HeartRates {
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        

    public HeartRates (String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public int maxHeartRate(int year) {
        //int age;
        int maxHeartRate = 0;
        maxHeartRate = 220 - age(year);
        return maxHeartRate;
    }
    public double targetRate(int year){
        double targetRate = 0.67 * maxHeartRate(year);
        return targetRate;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth(int day,int month,int year) {
        dateOfBirth = day + "/" + month + "/" + year;
        return dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int age(int year) {
        int age = 0;
        age = 2019 - year;
        return age;
    }

}    