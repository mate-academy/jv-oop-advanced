package core.basesyntax;

public class Rectangle extends Figure {
    protected double firstSide;
    protected double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public double getFigureArea() {
        return Math.round(firstSide * secondSide);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: rectangle, area: " + this.getFigureArea()
                + " sq.units, first side: " + firstSide + " units, second side: "
                + secondSide + " units, color: " + color);

    }
}
