package core.basesyntax;

public class Square extends Figure {
    private final String name = "Square";

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + name + ", area: " + getArea() + " sq.units" + getUniqueProperties()
                + ", color: " + color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getUniqueProperties() {
        return ", side: " + side + " units";

    }
}
