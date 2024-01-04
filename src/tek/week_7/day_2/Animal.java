package tek.week_7.day_2;

public class Animal {

    // Store some information of Animal

    private String animalName;
    private int animalAge;
    private double animalWeight;
    private String animalColor;

    // Getter & Setter methods

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName( String newAnimalName ) {
        animalName = newAnimalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge( int newAge ) {
        animalAge = newAge;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public void printAnimalInformation() {
        System.out.println("Animal Name: " + animalName);
        System.out.println("Animal Age: " + animalAge);
        System.out.println("Animal Weight: " + animalWeight);
        System.out.println("Animal Color: " + animalColor);
    }

}
