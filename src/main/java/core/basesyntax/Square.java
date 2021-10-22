package core.basesyntax;

public class Square extends Figure {
    private float side;

    public Square(float side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    public String draw() {
        return "Figure: square, area: " + getArea()
                + " sq.units, side: " + side + " units, color: "
                + getColor();
    }
}
