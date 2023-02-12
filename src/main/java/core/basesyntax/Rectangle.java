package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(Color color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + calculateArea()
                + " sq.units, first side: " + firstSide
                + " sq.units, second side: " + secondSide
                + " units, color: " + getColor();
    }
}
