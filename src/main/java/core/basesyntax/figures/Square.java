package core.basesyntax.figures;

public class Square extends Rectangle {
    private final int side;

    public Square(String color, int side) {
        super(color, side, side);
        this.side = side;
        super.area = getArea();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public void draw() {
        System.out.println("Figure: " + "square, "
                + "area: " + area + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + color.toLowerCase()
        );
    }
}
