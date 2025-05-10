package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return Math.round(firstSide * secondSide);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, first side: " + firstSide + " units, second side: "
                + secondSide + " units, color: " + getColor());

    }
}
