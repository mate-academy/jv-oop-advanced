package core.basesyntax;

public class Square extends Figure {
    private double side;
    private double area;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public Square(String color, double side, double area) {
        super(color);
        this.side = side;
    }

    @Override
    public double findArea() {
        area = side * side;
        return area;
    }

    @Override
    public String toString() {
        return "Figure: Square, "
                + "side: " + side
                + " units, area: " + area
                + " sq.units, " + "color: " + getColor();
    }
}
