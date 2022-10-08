package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getInfo() {
        return "Figure : Circle, Color : " + getColor()
                + ", Radius : " + radius
                + ", Area : " + getArea();
    }
}
