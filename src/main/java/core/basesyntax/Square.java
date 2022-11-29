package core.basesyntax;

public class Square extends Figure {
    private static final String FIGURE_NAME = "square";
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: " + FIGURE_NAME
                + ", area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + color;
    }
}
