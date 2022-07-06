package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

public class Square extends Figure {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int GetArea() {
        return side * side;
    }

    @Override
    public String toDraw() {
        return "Figure: square, area:" + GetArea()
                + " sq.units , side: " + getSide() +
                "units, color:" + getRandomColor();
    }
}
