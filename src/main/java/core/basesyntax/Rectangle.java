package core.basesyntax;

public class Rectangle extends Figure {
    private final String color;
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: " + secondSide
                + " units, color: " + getColor());
    }
}
