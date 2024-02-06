package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int lowerSide;
    private final int upperSide;
    private final int height;

    public IsoscelesTrapezoid(int lowerSide, int upperSide, int height, String color) {
        this.lowerSide = lowerSide;
        this.upperSide = upperSide;
        this.height = height;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (lowerSide + upperSide) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area: " + getArea()
                + " sq.units, lowerSide: " + lowerSide + " units, upperSide: "
                + upperSide + " sq.units, height: " + height + " units, color: " + getColor());
    }
}
