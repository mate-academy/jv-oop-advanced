package core.basesyntax;

public class Square extends Figure {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}' + super.getColor();
    }
}
