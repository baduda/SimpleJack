package heroes;

public class MainApp {
    public static void main(String[] args) {
        Hero[] heroes = {new Barbarian(), new Mage(), new Elf()};

        for (Hero hero : heroes) {
            hero.hit();
        }
    }

    static void dayRoutine(Hero hero) {
        hero.move();
        hero.prepareToBattle();
        hero.hit();
        hero.hit();
        hero.rest();
        hero.prepareToBattle();
        hero.hit();
        hero.prepareToBattle();
        hero.hit();
    }
}
