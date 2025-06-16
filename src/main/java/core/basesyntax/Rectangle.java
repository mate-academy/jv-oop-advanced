package core.basesyntax;

public class Rectangle  extends Figure {
    private final int firstSide = 6;
    private final int secondSide = 4;

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        return "Figure: Retangle, area: " + calculateArea() + " sq. units, firstSide: " + firstSide +" units, secondSide: " + secondSide + " units, color: " + color;
    }
}
