package core.basesyntax;

public class Square implements Figure {
    private final String color;
    private final int side;

    public Square(String color, int side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + color);
    }
}
