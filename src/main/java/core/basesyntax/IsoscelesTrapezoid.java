package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double shortSide;
    private double longSide;
    private double trapezoidH;
    private final String color;

    public IsoscelesTrapezoid(double shortSide, double longSide, double trapezoidH, String color) {
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.trapezoidH = trapezoidH;
        this.color = color;
    }

    public void draw() {
        System.out.println(
                "Figure: trapezoid, area: " + getArea()
                        + " sq. units, shortSide: " + this.shortSide
                        + " sq. units, longSide: " + this.longSide
                        + " units, h: " + this.trapezoidH
                        + " units, color: " + this.color);
    }

    @Override
    double getArea() {
        return ((longSide + shortSide) * trapezoidH) / 2;
    }
}
