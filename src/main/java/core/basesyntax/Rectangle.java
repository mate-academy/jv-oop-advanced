package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String toString() {
        return "Rectangle: "
                + "firstSide = " + firstSide
                + ", secondSide = " + secondSide
                + ',' + super.toString();
    }

    @Override
    public double areaCalculator() {
        return firstSide * secondSide;
    }
}
