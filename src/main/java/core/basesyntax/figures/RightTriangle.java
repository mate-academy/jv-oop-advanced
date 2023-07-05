package core.basesyntax.figures;

import java.util.Locale;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf(Locale.US,
                "Figure: %s, area: %.1f sq.units, first leg: %d units, "
                        + "second leg: %d units, color: %s%n",
                "right triangle", getArea(), firstLeg, secondLeg, color
        );
    }
}
