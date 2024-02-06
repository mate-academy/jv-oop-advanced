package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.service.AreaCalculator;
import core.basesyntax.service.Drawable;

public class IsoscelesTrapezium extends Figure implements AreaCalculator, Drawable {
    private double bottomBase;
    private double lateralSide;
    private double lowBaseGoal;

    public IsoscelesTrapezium(Color color, double bottomBase, double lateralSide,
                              double lowBaseGoal) {
        super(color);
        this.bottomBase = bottomBase;
        this.lateralSide = lateralSide;
        this.lowBaseGoal = lowBaseGoal;
    }

    @Override
    public double calculateArea() {
        return lateralSide * Math.sin(lowBaseGoal) * (bottomBase - lateralSide
                * Math.cos(lowBaseGoal));
    }

    @Override
    public void draw() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezium, area: "
                + calculateArea() + " sq.units, " + "bottom base: "
                + bottomBase + " sq.units, " + "lateral side: "
                + lateralSide + " sq.units, " + "low base goal: "
                + lowBaseGoal + " sq.units, "
                + "color: " + super.getColor();
    }
}
