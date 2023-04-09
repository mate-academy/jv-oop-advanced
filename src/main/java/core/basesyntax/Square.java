package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Square extends Figure {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (double) sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + getArea()
                        + "sq.units, side " + sideLength
                        + " units, color: " + getColor()
        );
    }
}
