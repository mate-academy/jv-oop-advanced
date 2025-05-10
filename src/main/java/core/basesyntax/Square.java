package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        if (side < 0) {
            throw new IllegalArgumentException("The parameter values must be positive");
        }
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
