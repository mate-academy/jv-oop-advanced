package core.basesyntax;

public class Square extends Figure {
    private final double side;
    private String color;

    public Square(double side, String color) {
        setColor(color);
        this.side = side;

    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: " + side
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
