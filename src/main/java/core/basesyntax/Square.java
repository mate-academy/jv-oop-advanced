package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void print() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
