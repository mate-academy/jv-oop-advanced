package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double area;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Rectangle(String color, double firstSide, double secondSide, double area) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double findArea() {
        area = firstSide * secondSide;
        return area;
    }

    @Override
    public String toString() {
        return "Figure: Rectangle, "
                + "firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, area: " + area
                + " sq.units, " + "color: " + getColor();
    }
}
