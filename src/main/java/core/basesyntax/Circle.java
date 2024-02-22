package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void describe() {

        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq, radius: "
                + getRadius() + " units, color: " + getColor());
    }
}
