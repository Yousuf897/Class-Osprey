package tek.week_7.day_2;

public class MobilePhone {

    private String brand;
    private double screenSize;
    private String mobileModel;
    private String mobileColor;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    public String getMobileColor() {
        return mobileColor;
    }

    public void setMobileColor(String mobileColor) {
        this.mobileColor = mobileColor;
    }

    public void printMobileInformation() {
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Mobile Model: " + mobileModel);
        System.out.println("Mobile Color: " + mobileModel);
    }

}
