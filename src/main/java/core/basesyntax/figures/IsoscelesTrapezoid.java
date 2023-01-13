package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double leg;

    public IsoscelesTrapezoid(String color, double topBase, double bottomBase, double leg) {
        super(color);
        this.bottomBase = bottomBase;
        this.leg = leg;
        this.topBase = topBase;
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
    public double getArea() {
        return Math.round(Math.sqrt(Math.pow(bottomBase + topBase, 2)
                * (bottomBase - topBase + 2 * leg)
                * (topBase - bottomBase + 2 * leg)) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, " + getArea() + " sq.units, "
                + "top base: " + topBase + " units, "
                + "bottom base: " + bottomBase + " units, "
                + "leg: " + leg + " units, "
                + "color: " + getColor());
    }
}
