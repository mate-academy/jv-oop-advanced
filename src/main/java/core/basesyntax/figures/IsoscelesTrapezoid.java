package core.basesyntax.figures;

import core.basesyntax.model.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double leg;
    private double topBase;
    private double bottomBase;

    public IsoscelesTrapezoid(double leg, double topBase, double bottomBase) {
        this.leg = leg;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(int topBase) {
        this.topBase = topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) / 2
                * Math.sqrt(4 * leg * leg
                - Math.pow((topBase - bottomBase), 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area: " + getArea()
                + " sq.units, leg: " + getLeg()
                + " units, top base: " + getTopBase()
                + " units, bottom base: " + getBottomBase()
                + " units, color: " + getColor());
    }
}
