package core.basesyntax;

import java.awt.*;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double leg;

    public IsoscelesTrapezoid(Color color, double topBase, double bottomBase, double leg) {
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
}
