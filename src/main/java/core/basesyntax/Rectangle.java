package core.basesyntax;

public class Rectangle extends Figure {
    private final int firstSide;
    private final int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: rectangle, area: "
                + getTheArea() + " sq.units, firstSide: "
                + firstSide + " sq.units, secondSide: "
                + secondSide + " units, color: " + getColor());
    }

    @Override
    public double getTheArea() {
        return firstSide * secondSide;
    }
}
