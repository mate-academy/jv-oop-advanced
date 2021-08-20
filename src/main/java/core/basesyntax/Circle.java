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

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void getInfo() {
        System.out.printf("Figure: %s, area: %s sq.units, radius: %s units, color: %s%n",
                getType(), getArea(), radius, getColor());
    }
}
