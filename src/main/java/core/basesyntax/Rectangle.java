package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double findArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle, "
                + "firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, area: " + findArea()
                + " sq.units, " + "color: " + getColor();
    }
}
