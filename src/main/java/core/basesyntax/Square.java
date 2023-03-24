package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double a) {
        side = a;
    }

    @Override
    public double getArea() {
        area = side * side;
        return area;
    }

    @Override
    public String getData() {
        data = "Figure: square, area: " + area + " sq.units, side: " + side
                + " units, color: " + color;
        return data;
    }
}
