package core.basesyntax;

public class Square extends Figure {
    private int side;
    private String color;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void getDraw() {
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
