package core.basesyntax;

public class IsoscelesTrapezoid extends Rectangle {
    private final double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        super(sideA, sideB, color);
        this.height = height;
        this.area = calculateArea();
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid : sideB=" + sideB + ", sideA=" + sideA + ", color="
                + color + ", area=" + area;
    }

    @Override
    public double calculateArea() {
        return (height / 2) * (sideA + sideB);
    }

}
