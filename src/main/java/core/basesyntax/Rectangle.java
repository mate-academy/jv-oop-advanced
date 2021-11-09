package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(String name, String color, double sideA, double sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "; " + "Area: " + getArea() + " sq.units; "
                + "Color: " + getColor() + ".");

    }
}
