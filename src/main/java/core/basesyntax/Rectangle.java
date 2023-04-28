package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB, Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Figure: Rectangle " + ", area: " + getArea()
                + ", sideA: " + sideA + ", sideB: " + sideB + ", color: " + getColor());
    }
}
