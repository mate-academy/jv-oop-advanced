package core.basesyntax;

public abstract class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void printInfo() {
        System.out.println( "Figure: rectangle, area: " + getArea() + "sq.units, first side: "
                + firstSide + "units, second side: " + secondSide + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
