package core.basesyntax;

public class Rectangle implements Figure {
    private final double sideA;
    private final double sideB;
    private final Color color;

    Rectangle(double sideA, double sideB, Color color) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getColor() {
        return color.name().toLowerCase();
    }

    @Override
    public double getArea() {
        double s;
        s = Math.sqrt(sideA * sideB);
        return s;
    }

    @Override
    public String display() {
        return "Figure: " + getName() + ", area: " + getArea() + " units, side: " + sideA
                + "," + sideB + " units, color: " + getColor();
    }
}
