package core.basesyntax;

public class Square extends Figure {
    private int side;

    @Override
    public double calculateArea() {
        return side * side;
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String draw() {
        return "Square{"
                + "side=" + side
                + ", color='" + color
                + '\'' + '}';
    }
}
