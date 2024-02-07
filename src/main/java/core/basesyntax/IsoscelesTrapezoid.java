package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int sideA;
    private final int sideB;
    private final int height;

    public IsoscelesTrapezoid(String color, int a, int b, int height) {
        super(color);
        sideA = a;
        sideB = b;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * height / 2.;
    }

    public String toString() {
        return "trapezoid, area: " + getArea()
                + " sq.units, downbase: " + sideA
                + " units, upbase: " + sideB
                + " units, height: " + height
                + ", color: " + color.toLowerCase();
    }
}
