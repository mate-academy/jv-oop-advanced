package core.basesyntax;

public class Square extends Figure {
    private double side;

    Square(double side, Colors color) {
        super("Square", color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return getFigureInfo() + String.format(", side: %.1f units", side);
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
