package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, Color color, double radius) {
        super(name, (Math.PI * radius * radius), color);
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
