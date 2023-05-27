package sg.edu.nus.iss.carwebdemo.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    
    private String brand;
    private String model;
    private String year;
    private String transmission;
    private String color;

    public Car() {
    }

    public Car(String brand, String model, String year, String transmission, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.transmission = transmission;
        this.color = color;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", year=" + year + ", transmission=" + transmission
                + ", color=" + color + "]";
    }

    

    
}
