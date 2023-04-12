package core.basesyntax;

public class Square implements Figure {
    private double side;
    private  String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
