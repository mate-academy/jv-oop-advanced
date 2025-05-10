package core.basesyntax;

public class Rectangle extends FigureClass {
    private final double side1;
    private final double side2;

    public Rectangle(Color color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.setInfo("Figure: rectangle, area: " + this.getArea() + " sq. units, side1: "
                + (int) this.side1 + " units, side2: " + (int) this.side2
                + " units, color: " + this.getColor().toString().toLowerCase());
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
}
