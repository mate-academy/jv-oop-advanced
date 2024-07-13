package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side,String color) {
        super(color);
        this.side = side;

    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square, area: %.2f sq. units, side %d units, color: %s%n",
                calculateArea(), side, color
        );
    }
}
