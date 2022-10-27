package shapes;

public abstract class BaseShape implements Shape {
    private final String name;

    public BaseShape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
