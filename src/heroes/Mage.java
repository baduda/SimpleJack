package heroes;

public class Mage extends Hero {

    @Override
    public void prepareToBattle() {
        System.out.println("Изучает заклинание");
    }

    @Override
    public void findEnemy() {
        System.out.println("Смотрит в хрустальный шар");
    }

    @Override
    public void move() {
        System.out.println("Использует телепорт");
    }

    @Override
    public void hit() {
        System.out.println("Выпускает фаербол");
    }
}
