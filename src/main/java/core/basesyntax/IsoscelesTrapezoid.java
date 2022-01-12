package core.basesyntax;

public class IsoscelesTrapezoid extends Figures implements Behaviour {
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
        return (topLength + baseLength) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units, top Length: " + topLength
                + " units, base Length: " + baseLength
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
