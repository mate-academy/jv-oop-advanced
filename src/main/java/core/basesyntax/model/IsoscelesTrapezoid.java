package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int side;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int side, String color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.side = side;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return ((double) firstBase + secondBase) / 4
                * Math.sqrt(4 * side * side - Math.pow(firstBase - secondBase, 2));
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq.units, firstBase:"
                + firstBase + " units, secondBase: "
                + secondBase + " units, side: "
                + side + " units, colour: " + getColor();
    }
}
