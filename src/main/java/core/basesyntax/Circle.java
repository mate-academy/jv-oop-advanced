package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "; " + "Area: " + getArea() + " sq.units; "
                + "Color: " + getColor() + ".");
    }
}
