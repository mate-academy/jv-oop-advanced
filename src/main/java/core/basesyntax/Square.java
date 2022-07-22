package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public String draws() {
        return "Figure: Square, area: " + getArea() + " sq. units, side: " + side
                + " units, color: " + new ColorSupplier().getRandomColor();
    }

    @Override
    public String toString() {
        return draws();
    }
}
