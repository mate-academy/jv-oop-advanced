package core.basesyntax;

public class Square implements Figure {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("core.basesyntax.Figure: square, area: "
                + getArea() + " sq. units, side: " + side
                + " units, color: " + color);
    }
}
