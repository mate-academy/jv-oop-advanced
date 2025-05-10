package core.basesyntax.figures;

import java.util.Locale;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.printf(Locale.US, "Figure: right triangle, area: %.1f sq. units, "
                        + "first leg: %.1f units, "
                        + "second leg: %.1f units, "
                        + "color: %s\n",
                getArea(), firstLeg, secondLeg, color);
    }
}
