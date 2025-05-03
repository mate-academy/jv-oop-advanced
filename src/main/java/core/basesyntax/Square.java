package core.basesyntax;

public class Square extends AbstractFigure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }
}