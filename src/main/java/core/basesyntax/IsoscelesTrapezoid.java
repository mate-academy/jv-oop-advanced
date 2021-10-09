package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int high;
    private int upperBase;
    private int bottomBase;

    public IsoscelesTrapezoid(int high, int upperBase, int bottomBase, String color) {
        super(color);
        this.high = high;
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
    }

    public int getHigh() {
        return high;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    public int getUpperBase() {
        return upperBase;
    }

    @Override
    public Double getArea() {
        return (double)(upperBase + bottomBase) * high / 2;
    }

    @Override
    public void draw() {
        System.out.format("Figure: isosceles trapezoid, area: %f, side: %d, bottomBase: %d"
                        + ", upperBase: %d, color: %s",
                getArea(), getHigh(), getBottomBase(), getUpperBase(), getColor());
    }
}
