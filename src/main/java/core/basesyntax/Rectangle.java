package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide,String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double obtainArea() {
        return firstSide * secondSide;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: rectangle, area: " + obtainArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: " + secondSide + " units, color: " + getColor());
    }
}
