package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(Colors color, int side) {
        super(side * side, color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, perimeter: "
                + getPerimeter() + " units, diagonal: "
                + getDiagonal() + " units, color: " + getColor());
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getDiagonal() {
        return side * Math.sqrt(2);
    }
}
