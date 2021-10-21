package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
        super.setType("circle");
    }

    public int getRadius() {
        return radius;
    }

    public Circle setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    @Override
    public void getInfo() {
        System.out.printf("Figure: %s, area: %s sq.units, radius: %s units, color: %s%n",
                getType(), getArea(), radius, getColor());
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
