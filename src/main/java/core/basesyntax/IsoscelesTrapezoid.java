package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int MAX_SIDE = 30;
    private int high;
    private int upperBase;
    private int bottomBase;

    public IsoscelesTrapezoid() {
        high = this.getRandom().nextInt(MAX_SIDE - 5);
        upperBase = this.getRandom().nextInt(MAX_SIDE - 5);
        bottomBase = this.getRandom().nextInt(MAX_SIDE);
        super.setColor();
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
                this.getArea(), this.getHigh(), this.getBottomBase(),
                this.getUpperBase(), this.getColor());
    }
}
