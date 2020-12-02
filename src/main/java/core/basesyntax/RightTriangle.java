package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side1;
    private final int side2;

    protected RightTriangle(Color color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    protected int getSide1() {
        return side1;
    }

    protected int getSide2() {
        return side2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Right triangle has drawn!");
    }

    @Override
    double getArea() {
        return (double) 1 / 2 * side1 * side2;
    }

    @Override
    public String toString() {
        return super.toString()
                + "side1: " + side1 + " units, "
                + "side2: " + side2 + " units.";
    }
}
