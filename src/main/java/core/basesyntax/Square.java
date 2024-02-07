package core.basesyntax;

public class Square extends Figure {
    private int side;

    @Override
    public double getArea() {
        return side * side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: square, area: " + String.format("%.2f",getArea())
                + " sq.units, side=" + side
                + ", color=" + getColor());
    }
}
