package tek.week_8.day_1;

public class Vehicle {

    private String companyName;
    private String model;
    private int numberOfDoors;
    private int year;

    public Vehicle(String companyName, String model, int numberOfDoors, int year) {
       setCompanyName(companyName);
       setModel(model);
       setNumberOfDoors(numberOfDoors);
       setYear(year);
    }

    public Vehicle() {
//    super("", "", 0, 0);
    }

    private String getCompanyName() {
        return companyName;
    }

    private Vehicle setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    private String getModel() {
        return model;
    }

    private Vehicle setModel(String model) {
        this.model = model;
        return this;
    }

    private int getNumberOfDoors() {
        return numberOfDoors;
    }

    private Vehicle setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    private int getYear() {
        return year;
    }

    private Vehicle setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "companyName='" + companyName + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", year=" + year +
                '}';
    }
}
