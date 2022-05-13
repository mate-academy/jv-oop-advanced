package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int hide;
    private final double lowerBase;
    private final double upperBase;

    public IsoscelesTrapezoid(int hide, int lowerBase, int upperBase, Colors color) {
        this.hide = hide;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (lowerBase + upperBase) / 2 * hide;
    }

    @Override
    public String drawFigure() {
        //  Figure: square, area: 25.0 sq.units, side: 5 units, color: blue
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, lower base: " + lowerBase
                + " units, upper base: " + upperBase
                + " units, hide: " + hide
                + " units, color: " + getColor();
    }
}
