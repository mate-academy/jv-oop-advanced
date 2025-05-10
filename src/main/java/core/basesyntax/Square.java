package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public String getInformation() {
        return "Figure: square, area: " + new DecimalFormat("#.#").format(getArea())
                + " sq.units, side: " + side + " units, color: " + getColor();
    }
}
