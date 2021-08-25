package core.basesyntax;

public final class Square extends Figure {
    private final float side;

    public Square(float side, String color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + getArea()
                + " sq.units, side: "
                + side
                + " units, color: "
                + getColor());
    }
}
