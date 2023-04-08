package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + getArea()
                        + "sq.units, side " + side
                        + " units, color: " + getColor()
        );
    }

}
