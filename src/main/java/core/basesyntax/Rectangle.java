package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double findArea() {
        return firstSide * secondSide;
    }

    public String draw() {
        return "Figure: rectangle, " + "area: " + String.format("%.1f",findArea())
                + " sq.units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, color: " + getColor();
    }
}
