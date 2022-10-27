package heroes;

public class Barbarian extends Hero {
    @Override
    public void prepareToBattle() {
        System.out.println("Пьет брагу");
    }

    @Override
    public void findEnemy() {
        System.out.println("Принюхивается");
    }

    @Override
    public void move() {
        System.out.println("Идет");
    }

    @Override
    public void hit() {
        System.out.println("Бьет топором по голове");
    }
}
