package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, ColorSupplier cs) {
        super(cs);
        this.side = side;
    }

    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", calculateArea()) + " sq.units, side: "
                + String.format("%.2f", side) + " units, color: " + color);
    }

    public double calculateArea() {
        return this.side * this.side;
    }
}
