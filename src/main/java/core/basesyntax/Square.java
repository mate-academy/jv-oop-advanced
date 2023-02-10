package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", calculateArea()) + " sq.units, side: "
                + String.format("%.2f", side) + " units, color: " + color);
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }
}
