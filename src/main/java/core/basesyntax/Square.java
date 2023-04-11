package core.basesyntax;

public class Square implements Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double gerArea() {
        return side * side;
    }
}
