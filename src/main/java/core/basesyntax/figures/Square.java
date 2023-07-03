package core.basesyntax.figures;

public class Square extends Rectangle {
    private final int side;

    public Square(String color, int side) {
        super(color, side, side);
        this.side = side;
        super.area = this.calculateArea();
    }

    @Override
    public double calculateArea() {
        return super.calculateArea();
    }

    public void draw() {
        System.out.println("Figure: " + "square, "
                + "area: " + area + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + color.toLowerCase()
        );
    }
}
