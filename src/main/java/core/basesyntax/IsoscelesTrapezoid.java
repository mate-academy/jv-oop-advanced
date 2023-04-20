package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + ", side a: " + sideA
                + ", side b: " + sideB
                + ", height: " + height
                + ", color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return (sideA + sideB / 2) * height;
    }
}
