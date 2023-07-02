package core.basesyntax.figure;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        String color = getColor().name().toLowerCase();
        return "Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + color;
    }
}
