package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double heightH) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = heightH;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public void print() {
        System.out.println("Figure IsoscelesTrapezoid area: " + getArea() + "SideA: " + sideA
                + "SideB: " + sideB + "HeghtH: " + height + "Color: " + getColor());

    }
}
