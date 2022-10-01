package core.basesyntax;

public class Square extends Rectangle {
    private final int side;

    public Square(Color color, int side) {
        super(color, side, side);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, "
                         + "side: " + side + " units, "
                         + "color: " + getColor());
    }
}
