package core.basesyntax;

public class Square extends Figure {
    private double side;

    Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square, area: %.2f sq.units, side: %.2f, color: %s%n",
                this.getArea(), side, this.getColor());
    }
}
