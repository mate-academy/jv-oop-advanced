package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + String.format("%.2f", getArea()) + " sq.units"
                + " side: " + String.format("%.2f", side)
                + " units, color: " + color);
    }
}
