package core.basesyntax;

public class RightTriangle implements Figure {
    private double sideA;
    private double sideB;
    private String color;

    public RightTriangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }


    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }

    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + getArea() + " sq.units, sideA: " + sideA + " sideB " + sideB + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
