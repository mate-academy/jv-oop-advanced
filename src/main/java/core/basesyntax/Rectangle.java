package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstSide;
    private final double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + getArea() + " sq.units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
