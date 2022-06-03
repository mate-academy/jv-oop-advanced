package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: square, area: " + getSquare() + " sq.units , side " + side
                + " units, color: " + getColor());
    }
}
