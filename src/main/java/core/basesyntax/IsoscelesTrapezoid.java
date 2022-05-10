package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int hide;
    private double lowerBase;
    private double upperBase;

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
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, lower base: " + lowerBase
                + " units, upper base: " + upperBase
                + " units, hide: " + hide
                + " units, color: " + getColor();
        //  Figure: square, area: 25.0 sq.units, side: 5 units, color: blue
    }
}
