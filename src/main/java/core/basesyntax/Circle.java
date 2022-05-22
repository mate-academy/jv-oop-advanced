package core.basesyntax;

public class Circle extends Figure implements Area{
    private int radius;

    public Circle(String color, String type) {
        super(color, type);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
