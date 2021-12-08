package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private String color;
    private double sideA;
    private double sideB;
    private double alpha;

    public IsoscelesTrapezoid(double sideA, double sideB, double alpha, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.alpha = alpha;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * (sideA - sideB) * Math.tan(alpha) / 4;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure : Isosceles Trapezoid " + "color: " + getColor()
                + " Side A: " + String.format("%.2f", sideA)
                + "Side B: " + String.format("%.2f", sideB)
                + " height: " + String.format("%.2f", alpha)
                + " area: " + String.format("%.2f", getArea()) + '}';
    }
}
