package core.basesyntax;

public class Square extends Figure {
    private int side;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toDraw() {
        return "Figure: square, area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + colorSupplier.getRandomColor();
    }
}
