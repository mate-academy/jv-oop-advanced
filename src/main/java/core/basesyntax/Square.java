package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {
        this.side = getNumber();
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Figure: square, area: "
               + String.format("%.2f", getArea()) + " sq.units, side: "
               + side + " units, color: "
               + getColor();
    }
}
