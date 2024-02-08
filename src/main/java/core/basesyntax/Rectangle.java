package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, "
                        + "area: %.1f sq. units, "
                        + "firstSide: %.1f sq. units, secondSide: %.1f sq. units,"
                        + " color: %s\n",
                calculateArea(), firstSide, secondSide, getColor());
    }
}
