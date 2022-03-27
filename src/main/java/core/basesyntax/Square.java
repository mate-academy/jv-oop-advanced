package core.basesyntax;

public class Square extends Figure implements BehaviorFigure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: "
                + "square, "
                + "area: "
                + getArea()
                + " sq.units, "
                + "side: "
                + side
                + " units, "
                + "color: "
                + getColor();
    }
}
