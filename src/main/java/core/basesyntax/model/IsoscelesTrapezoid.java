package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int height, String color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2.0 * height;
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq.units, firstBase:"
                + firstBase + " units, secondBase: "
                + secondBase + " units, height: "
                + height + " units, colour: " + getColor();
    }
}
