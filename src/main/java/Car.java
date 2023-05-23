import java.util.Objects;

public class Car {
    public String marka;
    public String model;
    public int engineСapacity;
    public int yearOfManufacture;

    public Car(String marka, String model, int engineСapacity, int yearOfManufacture) {
        this.marka = marka;
        this.model = model;
        this.engineСapacity = engineСapacity;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object,(Car) a) {
        if (model.equals(a.model) && yearOfManufacture == a.yearOfManufacture) {
            return true;
        } else {
            return false;
        }
    }
}
