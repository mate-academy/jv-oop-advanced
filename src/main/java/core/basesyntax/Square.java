package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
        side = 10;
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("" + getColor() + " square with area of " + area()
                + " sq.units and side of " + side + " units");
    }

    @Override
    public double area() {
        return side * side;
    }
}
