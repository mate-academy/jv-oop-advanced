package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square; Side: %.2f, Area: %.2f; Color: %s\n",
                side, getArea(), getColor()
        );
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
