package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int oneSide;
    private int lowerSide;
    private double angle;

    public IsoscelesTrapezoid(Color color, int oneSide, int lowerSide, double angle) {
        super(color);
        this.oneSide = oneSide;
        this.lowerSide = lowerSide;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return oneSide * Math.sin(angle) * (lowerSide * Math.cos(angle));
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + Math.rint(getArea())
                + " sq.units, one side: " + oneSide + " units, lower side: " + lowerSide
                + " units, angle: " + angle + " units, color: " + getColor());
    }

    public int getOneSide() {
        return oneSide;
    }

    public void setOneSide(int oneSide) {
        this.oneSide = oneSide;
    }

    public int getLowerSide() {
        return lowerSide;
    }

    public void setLowerSide(int lowerSide) {
        this.lowerSide = lowerSide;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}
