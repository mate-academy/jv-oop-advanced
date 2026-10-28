package core.basesyntax;

public class Square extends Figure {

    private final int quantitySide = 4;
    private double side = 10.0;

    public Square() {
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * quantitySide;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square, area: %.1f sq. units, perimeter: %.1f units, "
                        + "side: %.1f units, color: %s%n", getArea(), getPerimeter(), getSide(),
                getColor());
    }
}
