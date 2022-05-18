package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Colors color, double side) {
        super(color);
        this.side = side;
        this.setInfo("Figure: square, area: " + this.getArea() + " sq. units, side: "
                + (int) this.side + " units, color: " + this.getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
