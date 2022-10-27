package heroes;

public abstract class Hero {

    public abstract void prepareToBattle();

    public abstract void findEnemy();

    public abstract void move();

    public abstract void hit();

    public void rest() {
        System.out.println("Ложится спать");
    }

    public void hunt() {
        findEnemy();
        prepareToBattle();
        move();
        hit();
    }
}
