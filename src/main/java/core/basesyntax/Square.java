package core.basesyntax;

public class Square extends FigureClass {
    private final double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
        this.setInfo("Figure: square, area: " + this.getArea() + " sq. units, side: "
                + (int) this.side + " units, color: " + this.getColor().toString().toLowerCase());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
