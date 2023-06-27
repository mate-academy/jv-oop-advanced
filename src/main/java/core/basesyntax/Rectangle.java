package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + ", side a: " + sideA
                + ", side b: " + sideB
                + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }
}
