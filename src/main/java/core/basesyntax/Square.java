package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private double side;
    private Color color;
    private double area;

    public Square(double side) {
        this.side = side;
        this.area = getArea();
        this.color = super.getColor();
    }

    @Override
    public Double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area "
                + area + " sq.units, side: "
                + side + " units, color: "
                + color;
    }
}
