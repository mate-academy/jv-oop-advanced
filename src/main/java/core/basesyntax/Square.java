package core.basesyntax;

public class Square extends Figure {
    private double side1;

    public Square(String color, double side1) {
        super(color);
        this.side1 = side1;
    }

    @Override
    public double getArea() {
        return side1 * side1;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side 1: "
                + side1 + " units, color: " + color);
    }
}
