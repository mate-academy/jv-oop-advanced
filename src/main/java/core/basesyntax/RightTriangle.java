package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;

    private String color() {
        return getColor();
    }

    public RightTriangle(double sideA, double sideB, String color) {
        super(color);
        this.setSideA(sideA);
        this.setSideB(sideB);
    }

    @Override
    public double area() {
        return (sideA * sideB) / 2;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " units, sides: " + sideA + "," + sideB + ","
                + " units, color: " + color());
    }
}
