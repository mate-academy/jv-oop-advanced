package core.basesyntax;

public class Square extends Figure {
    private float side;

    public Square(String color, float side) {
        super(color);
        this.side = side;
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
