package shapes;

public class Square extends BaseShape {
    private final double side;

    public Square(double side, String name) {
        super(name);
        this.side = side;
    }

    public Square(double side) {
        this(side, "Square");
    }

    @Override
    public double size() {
        return side * side;
    }

    @Override
    public double length() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
