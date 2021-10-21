package core.basesyntax;

public class Square extends Figure {
    private float side = 6;

    public Square() {
    }

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float area() {
        return this.side * this.side;
    }

    public String toString() {
        return "Figure: square, area: " + area()
                + " sq.units, side: " + side + " units, color: "
                + getColor();
    }
}
