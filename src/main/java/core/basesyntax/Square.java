package core.basesyntax;

public class Square extends Rectangle {

    public Square(Color color, int side) {
        super(color, side, side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + String.format("%.1f", getArea())
                + " sq.units, side: " + getFirstSide()
                + " units, color: " + getColor().name().toLowerCase());
    }
}
