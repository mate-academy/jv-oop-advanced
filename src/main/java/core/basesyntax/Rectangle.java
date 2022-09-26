package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return (int)(firstSide * secondSide * 0.5 * 1000) / 1000.0;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, "
                + "area: " + calculateArea() + " sq.unit, "
                + "sides: " + firstSide + " " + secondSide + " units, "
                + "color: " + getColor().name().toLowerCase();
    }
}
