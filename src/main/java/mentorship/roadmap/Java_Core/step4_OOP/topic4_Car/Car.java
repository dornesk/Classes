package mentorship.roadmap.Java_Core.step4_OOP.topic4_Car;

public class Car {

    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        setYear(year);
    }

    public void displayInfo() {
        System.out.println("Brand: " + this.brand + " Model: " + this.model + " Year: " + this.year);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0) {
            this.year = year;
        } else {
            System.out.println("Год задан некорректно. Число не может быть отрицательным");
            this.year = 0;
        }
    }
}
