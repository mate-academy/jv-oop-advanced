package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + areaCalculator() + " side: " + side
                + ", color: " + getColor());
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }
}
