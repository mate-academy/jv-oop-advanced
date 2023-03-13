package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double longBase;
    private double shortBase;
    private double high;

    public double getLongBase() {
        return longBase;
    }

    public void setLongBase(double longBase) {
        this.longBase = longBase;
    }

    public double getShortBase() {
        return shortBase;
    }

    public void setShortBase(double shortBase) {
        this.shortBase = shortBase;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double getArea() {
        return (longBase + shortBase) / 2 * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, "
                + "area: " + getArea() + " sq.units, longBase: " + getLongBase()
                + ", shortBase: " + getShortBase() + ", high: " + getHigh()
                + ", color: " + getColor());
    }
}
