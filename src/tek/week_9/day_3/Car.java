package tek.week_9.day_3;

public class Car extends Vehicle {

    int maxSpeed;

    public Car(String vehicleModel, String vehicleCompany, int maxSpeed) {
        super(vehicleModel, vehicleCompany);
        this.setMaxSpeed(maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public Car setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
}
