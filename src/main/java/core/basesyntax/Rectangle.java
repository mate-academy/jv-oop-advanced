package core.basesyntax;

public class Rectangle implements Figure {
    private String color;
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure : Rectangle " + "color: " + getColor()
                + " side A " + String.format("%.2f", sideA)
                + " side B " + String.format("%.2f", sideB)
                + " area: " + String.format("%.2f", getArea()) + '}';
    }
}
