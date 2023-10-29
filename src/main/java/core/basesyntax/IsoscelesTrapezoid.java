package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int side1;
    private final int side2;
    private final int alpha;

    public IsoscelesTrapezoid(int side1, int side2, int alpha, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.alpha = alpha;
    }

    public double getArea() {
        double isoscelesTrapezoidArea;
        isoscelesTrapezoidArea = side1 * Math.sin(alpha) * (side2 - side1 * Math.cos(alpha));
        isoscelesTrapezoidArea = Math.round(isoscelesTrapezoidArea * 100.0) / 100.0;
        return isoscelesTrapezoidArea;
    }

    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, " + "area: " + getArea()
                + " sq.units, " + "side1: " + side1 + " units, "
                + "side2: " + side2 + " units, " + "alpha: " + alpha + " color: " + getColor());
    }
}
