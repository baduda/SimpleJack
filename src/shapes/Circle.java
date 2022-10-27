package shapes;

public class Circle extends BaseShape  {
    private final double r;

    public Circle(double r, String name) {
        super(name);
        this.r = r;
    }

    public Circle(double r) {
        this(r, "Circle");
    }

    @Override
    public double size() {
        return Math.PI * r * r;
    }

    @Override
    public double length() {
        return Math.PI * r * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(r);
        return (int) (temp ^ (temp >>> 32));
    }
}
