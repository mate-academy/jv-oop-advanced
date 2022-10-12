package core.basesyntax;

public class Rectangle extends FigureColor implements Figure, AreaCalculator {
    private int firstSide;
    private int secondSide;

    public void setRectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, firstSide: " + firstSide
                + " secondSide: " + secondSide
                + " units, color: " + getColor());
    }
}
