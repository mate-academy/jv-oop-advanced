package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = random.nextInt(Max_Value);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
