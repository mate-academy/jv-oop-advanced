package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int sideX, String color) {
        super(sideX, color);
        this.radius = sideX;
    }

    public double area() {
        return Math.round(Math.PI * Math.pow(radius, 2) * 10) / 10.0;
    }

    public String draw() {
        return "Figure: circle, area: " + area()
                + " sq. units, radius: " + radius
                + " units, color: " + color;
    }
}
