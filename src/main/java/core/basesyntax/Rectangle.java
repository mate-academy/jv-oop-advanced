package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private final double side1;
    private final double side2;

    public Rectangle(Colors color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + calculateArea() + " sq. units, side 1: "
                + side1 + " units, " + "side 2 " + side2 + " units, color: " + color);
    }
}
