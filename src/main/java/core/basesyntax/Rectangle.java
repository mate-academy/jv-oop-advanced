package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", calculateArea()) + " sq.units, side1: "
                + String.format("%.2f", side1) + ", side2: "
                + String.format("%.2f", side2) + " units, color: " + color);
    }

    @Override
    public double calculateArea() {
        return this.side1 * this.side2;
    }
}
