package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String getData() {
        return "Figure: rectangle, area: " + area + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide + " units, color: " + color;
    }
}
