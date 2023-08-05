package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + calculateArea() + " sq.units, side: " + side
                + " units, color: " + getColor());
    }
}
