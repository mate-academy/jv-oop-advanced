package core.basesyntax.figures;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double lateralSide;

    public IsoscelesTrapezoid(String color, double topSide, double bottomSide, double lateralSide) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.lateralSide = lateralSide;
    }

    public double getTopSide() {
        return topSide;
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public void setBottomSide(double bottomSide) {
        this.bottomSide = bottomSide;
    }

    public double getLateralSide() {
        return lateralSide;
    }

    public void setLateralSide(double lateralSide) {
        this.lateralSide = lateralSide;
    }

    public double getArea() {
        double a = this.topSide;
        double b = this.bottomSide;
        double c = this.lateralSide;
        double height = Math.sqrt(Math.pow(c, 2) - Math.pow((a - b) / 2, 2));
        return 0.5 * (a + b) * height;
    }

    @Override
    public void draw() {
        System.out.printf(Locale.US, "Figure: isosceles trapezoid, area: %.1f sq. units, "
                        + "top-side: %.1f units, "
                        + "bottom-side: %.1f units, "
                        + "lateral-side: %.1f units, "
                        + "color: %s\n",
                getArea(), topSide, bottomSide, lateralSide, color);
    }
}
