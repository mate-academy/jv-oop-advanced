package core.basesyntax;

public class Square extends Figure {
    private final double sideA;
    private final double sideB;

    public Square(String name, String color, double sideA, double sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "; " + "Area: " + getArea() + " sq.units; "
                + "Color: " + getColor() + ".");
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
