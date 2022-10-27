package cars;

public class Car extends AbstractCar {
    int tankVolume;
    int gear;

    @Override
    public void accelerate() {
        System.out.println("Wroom!");
    }

    @Override
    public void stop() {
        System.out.println("Wroom!");
    }
}
