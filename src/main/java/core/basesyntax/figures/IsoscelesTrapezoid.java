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

    @Override
    public double getArea() {
        double height = Math.sqrt(Math.pow(lateralSide, 2) - Math.pow((topSide - bottomSide) / 2, 2));
        return 0.5 * (topSide + bottomSide) * height;
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
