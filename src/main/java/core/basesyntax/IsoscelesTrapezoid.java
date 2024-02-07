package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int high;
    private int lowerBase;
    private int upperBase;

    public IsoscelesTrapezoid(Color color, int high, int lowerBase, int upperBase) {
        super(color);
        this.high = high;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;

    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(int lowerBase) {
        this.lowerBase = lowerBase;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(int upperBase) {
        this.upperBase = upperBase;
    }

    @Override
    public double getArea() {
        return ((lowerBase * upperBase) / 2) * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid color: " + getColor()
                + " area: " + getArea() + " sq.units "
                + " high: " + high
                + " lowerBase: " + lowerBase
                + " upperBase: " + upperBase);
    }
}
