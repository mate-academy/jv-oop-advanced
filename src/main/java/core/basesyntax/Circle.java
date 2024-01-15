package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle:\n"
                + " radius: " + radius
                + " color: " + getColor()
                + " area: " + getArea());
    }
}
