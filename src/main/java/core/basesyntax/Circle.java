package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
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
    public int getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: Circle , area: %s sq.units, radius: %s units, color: "
                + "%s%n", getArea(), radius, getColor());
    }
}
