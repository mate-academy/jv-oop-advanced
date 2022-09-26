package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double side;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase, double side) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double height = Math.sqrt(side * side - 0.25
                * (firstBase - secondBase) * (firstBase - secondBase));
        return (int)(0.5 * (firstBase + secondBase) * height * 1000) / 1000.0;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, "
                + "area: " + calculateArea() + " sq.unit, "
                + "sides: " + firstBase + " " + secondBase + " units, "
                + "color: " + getColor().name().toLowerCase();
    }
}
