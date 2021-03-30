package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure:" + getName()
                + " area : " + calculateArea() + " sq. units,"
                + " radius : " + radius
                + " color: " + getColor());
    }
}
