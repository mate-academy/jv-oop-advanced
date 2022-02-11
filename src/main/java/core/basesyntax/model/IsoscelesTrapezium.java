package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.service.FigureArea;
import core.basesyntax.service.FigureDrawing;

public class IsoscelesTrapezium extends Figure implements FigureArea, FigureDrawing {
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
    public double area() {
        return lateralSide * Math.sin(lowBaseGoal) * (bottomBase - lateralSide
                * Math.cos(lowBaseGoal));
    }

    @Override
    public void drawFigure() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezium, area: "
                + area() + " sq.units, " + "bottom base: "
                + bottomBase + " sq.units, " + "lateral side: "
                + lateralSide + " sq.units, " + "low base goal: "
                + lowBaseGoal + " sq.units, "
                + "color: " + super.getColor();
    }
}
