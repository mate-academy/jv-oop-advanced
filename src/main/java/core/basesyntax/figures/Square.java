package core.basesyntax.figures;

public class Square extends Figure {
    protected double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %.2f, side: %.2f, color: %s%n",
                getArea(), side, color);
    }
}
