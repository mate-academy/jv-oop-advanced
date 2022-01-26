package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    Circle(String color, double radius) {
        super(color);

        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String draw() {
        return "\n" + "Circle - " + getColor()
                + "\n" + "big side: " + radius
                + "\n" + "area: " + getArea();
    }
}
