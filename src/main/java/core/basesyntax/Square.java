package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, Color color) {
        this.side = side;
        super.color = color;
    }

    private double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea() + " sq.units, side " + side
                + " units, color: " + super.color);
    }
}
