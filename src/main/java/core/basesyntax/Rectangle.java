package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        return "Figure: "
                + "rectangle, area: "
                + getArea() + " sq.units, firstSide: "
                + firstSide
                + " units, secondSide: "
                + secondSide
                + " units, color: " + getColor().toLowerCase();
    }
}
