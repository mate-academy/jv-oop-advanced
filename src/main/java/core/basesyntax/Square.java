package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + getAreaCalculator() + " sq.units,"
                + " side: " + side + " units,"
                + " color: " + color);
    }

    @Override
    public double getAreaCalculator() {
        return side * side;
    }
}
