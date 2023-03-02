package core.basesyntax;

public class Rectangle extends Figure {
    private static final String name = "Rectangle";
    private final int firstSide;
    private final int secondSide;

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
        System.out.println("Figure: " + name + ", area: "
                + getArea() + " sq.units, first side: "
                + firstSide + " units, second side: " + secondSide
                + " units, color: " + getColor());
    }
}
