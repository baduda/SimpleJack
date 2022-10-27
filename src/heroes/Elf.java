package heroes;

public class Elf extends Hero {
    @Override
    public void prepareToBattle() {
        System.out.println("Играет на лютне");
    }

    @Override
    public void findEnemy() {
        System.out.println("Использует взгляд орла");
    }

    @Override
    public void move() {
        System.out.println("Тихо крадется");
    }

    @Override
    public void hit() {
        System.out.println("Метко стреляет из лука");
    }
}
