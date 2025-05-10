package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: circle, area: %s sq.units, "
                + "radius: %s units, color: "
                + "%s%n", getArea(), radius, getColor());
    }
}
