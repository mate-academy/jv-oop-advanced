package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public String toString() {
        return "Square {area=" + getArea()
                + " sq.units, side=" + side
                + " units, color='" + getColor()
                + '\'' + '}';
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this);
    }
}
