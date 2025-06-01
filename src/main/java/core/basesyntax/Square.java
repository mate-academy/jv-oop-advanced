package core.basesyntax;

public class Square implements Figure, Colorable {
    private double side;
    private String color;

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
        System.out.println("Figure: square, area: "
                + getArea() + " sq.units, side: "
                + side + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
