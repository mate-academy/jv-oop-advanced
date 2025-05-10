package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public static final int MAX_HEIGHT = 20;
    public static final int MAX_UPPER_BASE = 20;
    public static final int MAX_LOWER_BASE = 20;
    private int height;
    private int upperBase;
    private int lowerBase;

    public IsoscelesTrapezoid(Color color, int height, int upperBase, int lowerBase) {
        super(color);
        this.height = height;
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(int upperBase) {
        this.upperBase = upperBase;
    }

    public int getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(int lowerBase) {
        this.lowerBase = lowerBase;
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) * height / 2.0;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, upperBase: " + upperBase
                + " units, lowerBase: " + lowerBase
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
