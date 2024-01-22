package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int side;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int side, String color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.side = side;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return (firstBase + secondBase) / 2.0
                * Math.sqrt(side * side - Math.pow((firstBase - secondBase) / 2.0, 2));
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: "
                + calculateArea() + " sq. units, "
                + "firstBase: " + firstBase + " units, "
                + "secondBase: " + secondBase + " units, "
                + "side: " + side + " units, "
                + "color: " + color + ".";
    }
}
