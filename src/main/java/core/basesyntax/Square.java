package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: "
                + String.format("%.2f", getArea()) + " sq.units, side: "
                + String.format("%.2f", side) + " units, color: " + getColor());
    }
}
