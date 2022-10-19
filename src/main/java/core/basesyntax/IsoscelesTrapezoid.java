package core.basesyntax;

public class IsoscelesTrapezoid extends _2SideFigure implements Squarable{
    private final int d;
    public IsoscelesTrapezoid(String color, int a, int b, int d) {
        super(color, a, b);
        this.d = d;
    }

    @Override
    public double getSquare() {
        return (a + b) * d / 2.;
    }

    @Override
    public String toString() {
        return "trapezoid, area: " + getSquare() + " sq.units, downbase: " + a + " units, upbase: " + b + " units, height: " + d + ", color: " + color.toLowerCase();
    }
}
