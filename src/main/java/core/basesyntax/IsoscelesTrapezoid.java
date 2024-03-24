package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double leg;
    private double bottomBase;
    private double topBase;

    public IsoscelesTrapezoid(String color, double leg, double bottomBase, double topBase) {
        super(color);
        this.leg = leg;
        this.bottomBase = bottomBase;
        this.topBase = topBase;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ','
                + " leg: " + leg
                + " topBase: " + topBase
                + " bottomBase: " + bottomBase);
    }
}
