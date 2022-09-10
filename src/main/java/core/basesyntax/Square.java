package core.basesyntax;

public class Square extends Rectangle {
    private double side;

    public Square(String color, double side) {
        super(color, side, side);
        if (side > 0) {
            this.side = side;
        }
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
                getColor().toLowerCase(), getArea(), side);
    }
}
