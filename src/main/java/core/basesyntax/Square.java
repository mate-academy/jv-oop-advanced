package core.basesyntax;

public class Square extends Rectangle {
    public Square(final String color, final int side) {
        super(color, side, side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + "square,"
                + " area: "
                + getArea()
                + " sq.units,"
                + " side: "
                + height
                + " units, "
                + "color: "
                + getColor());
    }
}
