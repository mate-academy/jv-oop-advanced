package core.basesyntax;

public class Square extends Figure {

    private double side;

    public Square(final String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw square with side = " + side);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea()
                + " sq. units, side = " + side + ", " + super.toString();
    }
}
