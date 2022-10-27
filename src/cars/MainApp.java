package cars;

import persons.Person;

public class MainApp {
    public static void main(String[] args) {
        TeslaCar tesla = new TeslaCar();
        tesla.model = "Model Y";
    }

    static void startStop(Vehicle vehicle) {
        System.out.println(vehicle.getModel() + ":");
        vehicle.accelerate();
        vehicle.stop();
        vehicle.accelerate();
        System.out.println("-----------------------------------");
    }
}
