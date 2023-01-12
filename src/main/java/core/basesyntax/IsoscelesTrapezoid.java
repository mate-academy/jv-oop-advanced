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
}
