package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private int topLength;
    private int baseLength;
    private int height;
    private final String name = "isosceles trapezoid";

    public void setTopLength(int topLength) {
        this.topLength = topLength;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBaseLength(int baseLength) {
        this.baseLength = baseLength;
    }

    @Override
    public double getArea() {
        return (double) (topLength + baseLength) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, top length: " + topLength
                + " units, base length: " + baseLength
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
