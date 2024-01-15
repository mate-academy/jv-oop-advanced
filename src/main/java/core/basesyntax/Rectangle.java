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
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String drawFigure() {
        return "Figure: rectangle, area: " + getArea()
                + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide
                + " units, color: " + getColor();
    }
}
