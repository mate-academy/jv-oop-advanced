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
    public void getInfo() {
        System.out.printf("Figure: circle, area: %s sq.units, radius: %s units, color: %s%n",
                getArea(), radius, getColor());
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
