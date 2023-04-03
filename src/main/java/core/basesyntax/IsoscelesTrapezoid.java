package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private final double sideA, sideB, height;
    private final Color color;

    IsoscelesTrapezoid(double sideA, double sideB, double height, Color color) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public String getColor() {
        return color.name().toLowerCase();
    }

    @Override
    public double getArea() {
        double s;
        s = Math.sqrt(((sideA + sideB) / 2) * height);
        return s;
    }

    @Override
    public String display() {
        return "Figure: " + getName() + ", area: " + getArea() + " units, side: " + sideA + "," + sideB
                + " height: " + height + " units, color: " + getColor();
    }
}
