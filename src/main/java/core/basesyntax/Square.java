package core.basesyntax;

public class Square extends Figure {
    private int side;

    @Override
    public double calculateArea() {
        return side * side;
    }

    public Square(int side, String color) {
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
