package core.basesyntax;

public class Square extends Figure {
    private int sideLength;

    public Square(String colour, int sideLength) {
        super(colour, "Square");
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ","
                + " area: " + getArea() + " sq. units,"
                + " colour: " + getColour() + ","
                + " side length: " + getSideLength());
    }
}
