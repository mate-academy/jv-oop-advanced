package core.basesyntax;

public class Square extends Figure  {
    private double side;

    @Override
    public double getArea() {
        return side *  side;
    }

    public Square(double side) {
        this.side = side;
    }
}
