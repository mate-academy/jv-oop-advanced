package core.basesyntax;

public class Square extends Figure implements Area {
    private int side;
    public Square(int side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} area:" + getArea() + " color: " + super.color;
    }
}
