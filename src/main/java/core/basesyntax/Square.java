package core.basesyntax;

public class Square extends Figure {
    private static final String FIGURE = "square";
    private int side;

    protected Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double findArea() {
        return side * side;
    }

    @Override
    public String toDraw() {
        return "Figure: " + FIGURE + ", area: " + findArea() + ", side: " + this.side
                + ", color: "
                + this.color;
    }
}
