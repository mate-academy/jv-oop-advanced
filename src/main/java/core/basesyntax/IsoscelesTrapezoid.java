package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int lowerBase;
    private int upperBase;

    public IsoscelesTrapezoid(Color color, int height, int lowerBase, int upperBase) {
        super(color);
        this.height = height;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
        return lowerBase * upperBase / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid color: " + getColor()
                + " area: " + getArea() + " sq.units "
                + " high: " + height
                + " lowerBase: " + lowerBase
                + " upperBase: " + upperBase);
    }
}
