package core.basesyntax;

public class IsoscelesTrapezoid extends Rectangle {
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        super(sideA, sideB, color);
        this.height = height;
        this.area = getArea();
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" +
                "sideB=" + sideB +
                ", sideA=" + sideA +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    public double getArea() {
        return height/2 * (sideA + sideB);
    }
}
