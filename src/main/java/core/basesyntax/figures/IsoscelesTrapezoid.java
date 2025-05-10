package core.basesyntax.figures;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstBase;
    private int secondBase;

    public IsoscelesTrapezoid(String color, int height, int firstBase, int secondBase) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return height * (firstBase + secondBase) / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf(Locale.US, "Figure: %s, area: %.1f sq.units, first base: %d units, "
                        + "second base: %d units, height: %d units, color: %s%n",
                "isosceles trapezoid", getArea(), firstBase, secondBase, height, color
        );
    }
}
