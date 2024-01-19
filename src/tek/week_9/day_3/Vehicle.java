package tek.week_9.day_3;

public class Vehicle {

    String vehicleModel;
    String vehicleCompany;

    public Vehicle(String vehicleModel, String vehicleCompany) {
        this.setVehicleModel(vehicleModel);
        this.setVehicleCompany(vehicleCompany);
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public Vehicle setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }

    public String getVehicleCompany() {
        return vehicleCompany;
    }

    public Vehicle setVehicleCompany(String vehicleCompany) {
        this.vehicleCompany = vehicleCompany;
        return this;
    }
}
