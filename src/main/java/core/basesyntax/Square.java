package core.basesyntax;

public class Square extends AbstractFigure {
    private double side;

    public Square(String name, double side, Color color) {
        super(name, color);
        this.side = side;
    }

    public Square(double side, Color color) {
        this("Square", side, color);
    }

    @Override
    public double getArea() {
        return Math.round(side * side * 100.0) / 100.0;
    }

}
