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

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + String.format("%.2f", getArea()) + " sq. units, side: "
                + String.format("%.2f", side) + " units, color: " + color);
    }
}