package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units,"
                + " side: " + side + " units,"
                + " color: " + color);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
