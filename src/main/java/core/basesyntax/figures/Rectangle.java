package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final double side1;
    private final double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (double) Math.round(side1 * side2 * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, side1: " + side1
                + " units, side2: " + side2 + " units, color: " + color);

    }
}
