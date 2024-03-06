package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(Colors color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {

        return side * side;
    }
}
