package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.getArea() + " sq. units, side: "
                + this.side + " units, color: " + this.getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
