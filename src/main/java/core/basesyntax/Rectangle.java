package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
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
