package core.basesyntax;

public class RightTriangle implements Figure {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final Color color;

    RightTriangle(double sideA, double sideB, double sideC, Color color) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public String getColor() {
        return color.name().toLowerCase();
    }

    @Override
    public double getArea() {
        double s;
        s = Math.sqrt((sideA * sideB) / 2);
        return s;
    }

    @Override
    public String display() {
        return "Figure: " + getName() + ", area: " + getArea() + " units, sides: "
                + sideA + "," + sideB + "," + sideC + " units, color: " + getColor();
    }
}
