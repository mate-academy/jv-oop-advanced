package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("core.basesyntax.Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + color);
    }
}
