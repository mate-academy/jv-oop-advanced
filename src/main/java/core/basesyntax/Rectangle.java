package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private int side1;
    private int side2;

    public Rectangle(String color, int side1, int side2) {
        if (side1 < 0 || side2 < 0) {
            throw new IllegalArgumentException("The parameter values must be positive");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, side1: " + side1
                + " units, side2: " + side2
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
}
