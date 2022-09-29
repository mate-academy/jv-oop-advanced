package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideBig;
    private double sideShort;
    private double height;

    public IsoscelesTrapezoid(String color, double sideBig, double sideShort, double height) {
        super(color);
        if (sideShort > 0 && sideBig > 0 && height > 0 && sideBig > sideShort) {
            this.sideBig = sideBig;
            this.sideShort = sideShort;
            this.height = height;
        }
    }

    @Override
    public double getArea() {
        return ((sideBig + sideShort) * height) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isoscelesTrapezoid, area " + getArea()
                + " sq.units, sideBig: " + sideBig
                + " units, sideShort: " + sideShort
                + " units, height: " + height + " units, color: " + getColor());
    }
}
