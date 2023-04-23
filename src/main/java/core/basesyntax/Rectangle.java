package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super.setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String printFigure() {
        return "Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq.units, side: " + firstSide
                + " units, side: " + secondSide
                + " units, color: " + getColor();
    }
}
