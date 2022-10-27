package cars;

public class ElectricCar extends AbstractCar {
    int cellCapacity;
    int chargeType;

    @Override
    public void accelerate() {
        System.out.println("Shhhhhh!");
    }

    @Override
    public void stop() {
        System.out.println("Recuperation");
    }
}
