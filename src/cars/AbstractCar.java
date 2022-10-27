package cars;

public abstract class AbstractCar implements Vehicle {
    String model;
    protected double price;

    @Override
    public String getModel() {
        return model;
    }
}
