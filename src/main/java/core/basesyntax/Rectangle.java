package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return "Figure - rectangle, area = " + String.format("%1f", getArea()).replace(",", ".")
                + " sq.units, firstSide = " + firstSide + " units, secondSide = " + secondSide
                + " units, color - " + getColor();
    }
}
