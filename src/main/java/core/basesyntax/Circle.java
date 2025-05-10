package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: Circle, Area: " + getArea() + " sq. units, Radius: " + radius
                + " units, Color: " + getColor());
    }
}
