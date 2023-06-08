package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units,"
                        + "firstSide: %d units, secondSide: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), firstSide, secondSide, getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
