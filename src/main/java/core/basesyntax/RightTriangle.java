package core.basesyntax;
import java.util.Locale;
class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }
    public double getFirstLeg() {
        return firstLeg;
    }
    public double getSecondLeg() {
        return secondLeg;
    }
    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }
    @Override
    public void draw() {
        System.out.println(String.format(Locale.US,
                "Figure: right triangle, area: %.2f sq. units, firstLeg: %.1f units, "
                        + "secondLeg: %.1f units, color: %s",
                getArea(), firstLeg, secondLeg, getColor()));
    }
}
