package core.basesyntax;

public class Square extends Figure {
    private int sideLength;

    public Square(int sideLength, Color color) {
        this.sideLength = sideLength;
        setColor(color);
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side length: " + sideLength
                + " units, color: " + getColor());
    }
}
