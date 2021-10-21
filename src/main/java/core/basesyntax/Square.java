package core.basesyntax;

public class Square extends Figure {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float area() {
        return side * side;
    }

    public String draw() {
        return "Figure: square, area: " + area()
                + " sq.units, side: " + side + " units, color: "
                + getColor();
    }
}
