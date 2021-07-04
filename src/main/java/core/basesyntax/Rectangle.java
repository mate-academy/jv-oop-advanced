package core.basesyntax;

public class Rectangle extends Figure {
    private int sideLength;
    private int secondSideLength;

    public Rectangle(String colour, int sideLength, int secondSideLength) {
        super(colour, "Rectangle");
        this.sideLength = sideLength;
        this.secondSideLength = secondSideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * secondSideLength;
    }

    private int getSecondSideLength() {
        return secondSideLength;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ","
                + " area: " + getArea() + " sq. units,"
                + " colour: " + getColour() + ","
                + " first side length: " + getSideLength() + ","
                + " second side length: " + getSecondSideLength());
    }
}
