package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square {"
                + "side=" + side
                + ", color is " + this.getColor() + '}';
    }
}

