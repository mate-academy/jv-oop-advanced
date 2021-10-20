package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle() {
        this.firstSide = getNumber();
        this.secondSide = getNumber();
    }

    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: "
                + String.format("%.2f", getArea()) + " sq.units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, color: "
                + getColor();
    }
}
