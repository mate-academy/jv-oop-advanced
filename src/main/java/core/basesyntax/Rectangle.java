package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double a, double b) {
        firstSide = a;
        secondSide = b;
    }

    @Override
    public double getArea() {
        area = firstSide * secondSide;
        return area;
    }

    @Override
    public String getData() {
        data = "Figure: rectangle, area: " + area + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide + " units, color: " + color;
        return data;
    }
}
