package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String getInfo() {
        return "Figure: rectangle, area: "
                + String.format("%.2f", getArea()) + " sq.units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, color: "
                + getColor();
    }
}
