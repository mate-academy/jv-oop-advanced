package core.basesyntax;

public class Square implements Figure {
    private final String color;
    private final double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + color);
    }
}
