package core.basesyntax;

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
    public double area() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format(Locale.US, "Figure: right triangle, "
                        + "area: %.1f sq.units, firstLeg: %d units, SecondLeg: %d color: %s",
                area(), this.firstLeg, this.secondLeg, this.getColor()));
    }
}
