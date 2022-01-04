package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square() {

    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: square, area: " + areaCalculator()
                + " sq.units, side: " + side
                + " units, color: " + getColor());
    }
}
