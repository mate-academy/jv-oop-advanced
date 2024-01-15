package core.basesyntax;

public class Square extends Rectangle {
    private double side;

    public Square(String color, double side) {
        super(color, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.format("Figure: square, color: %s, area = %.2f, side = %.2f\n",
                getColor(), getArea(), side);
    }
}
