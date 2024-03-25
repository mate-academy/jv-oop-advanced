package core.basesyntax;

public class IsoscelesTrapezoid extends RightTriangle {
    private static final double DEFAULT_DECIMAL_RANK = 10.0;
    private final int topBase;

    public IsoscelesTrapezoid(
            String color, int firstLeg, int secondLeg, int bottomBase, int topBase
    ) {
        super(color, firstLeg, secondLeg, bottomBase);
        this.topBase = topBase;
    }

    @Override
    public double getArea() {
        return Math.round(((double) (topBase + getBottomBase()) / 2
                * Math.sqrt(Math.pow(getFirstLeg(), 2)
                - Math.pow((double) (getBottomBase() - topBase) / 2, 2)))
                * DEFAULT_DECIMAL_RANK) / DEFAULT_DECIMAL_RANK;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units,"
                + " firstLeg: " + getFirstLeg() + " units,"
                + " secondLeg: " + getSecondLeg() + " units,"
                + " bottomBase: " + getBottomBase() + " units,"
                + " topBase: " + topBase + " units,"
                + " color: " + getColor()
        );
    }
}
