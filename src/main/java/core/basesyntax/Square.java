package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square; area: " + getArea() + " square units;"
                + " side: " + side + " units; "
                + getColor());
    }
}
