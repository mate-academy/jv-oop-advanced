package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return (side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea() + " sq. units, side: "
                + side + " units, color: "
                + getColor());
    }
}
