package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double lowBase;
    private double upperBase;
    private double sidePart;

    public IsoscelesTrapezoid(String color, double lowBase, double upperBase, double sidePart) {
        super(color);
        this.lowBase = lowBase;
        this.upperBase = upperBase;
        this.sidePart = sidePart;
    }

    @Override
    public double getArea() {
        return ((upperBase + lowBase) / 2) * Math.sqrt(lowBase * lowBase
                - Math.pow((lowBase - upperBase) / 2, 2));
    }

    @Override
    public String draw() {
        return String.format("Figure: %s isosceles trapezoid, low base: %.2f,"
                             + " upper base: %.2f, side parts: %.2f, area: %.2f",
                            this.color, this.lowBase, this.upperBase,
                            this.sidePart, this.getArea());
    }
}
