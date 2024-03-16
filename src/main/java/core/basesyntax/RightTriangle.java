package core.basesyntax;

public class RightTriangle extends Figure {
    private static final double DEFAULT_DECIMAL_RANK = 10.0;
    private int firstLeg;
    private int secondLeg;
    private int bottomBase;

    public RightTriangle(String color, int firstLeg, int secondLeg, int bottomBase) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.bottomBase = bottomBase;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    @Override
    public double getArea() {
        return Math.round(
                (double) firstLeg * secondLeg / 2 * DEFAULT_DECIMAL_RANK) / DEFAULT_DECIMAL_RANK;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units,"
                + " firstLeg: " + firstLeg + " units,"
                + " secondLeg: " + secondLeg + " units,"
                + " bottomBase: " + bottomBase + " units,"
                + " color: " + getColor()
        );
    }
}
