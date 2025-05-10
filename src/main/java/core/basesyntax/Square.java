package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String string = String.format("Figure: Square, area: %,.2f sq. units, "
                + "radius: %d units, "
                + "color: %s", getArea(), side, getColor());
        System.out.println(string);
    }
}
