package core.basesyntax;

public class IsoscelesTrapezoid extends Side2Figure {
    private final int height;

    public IsoscelesTrapezoid(String color, int a, int b, int height) {
        super(color, a, b);
        this.height = height;
    }

    @Override
    public double getSquare() {
        return (sideA + sideB) * height / 2.;
    }

    @Override
    public String toString() {
        return "trapezoid, area: " + getSquare()
                + " sq.units, downbase: " + sideA
                + " units, upbase: " + sideB
                + " units, height: " + height
                + ", color: " + color.toLowerCase();
    }
}
