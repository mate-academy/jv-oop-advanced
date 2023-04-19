package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void printInfo() {
        setArea((sideA + sideB / 2) * height);
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + ", side a: " + sideA + ", side b: " + sideB + ", height: " + height + ", color: " + getColor());
    }
}
