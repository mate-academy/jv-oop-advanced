package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, double area, Color color, double radius) {
        super(name, area, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void print() {
        System.out.println("   " + getName() + "   " + getArea()
                + "   " + getColor() + "   " + getRadius());
    }
}
