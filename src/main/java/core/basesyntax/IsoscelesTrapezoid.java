package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double leg;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double leg) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.leg = leg;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = bottomBase;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("top base: " + topBase);
        System.out.println("bottom base: " + bottomBase);
        System.out.println("leg: " + leg);
    }
}
