package core.basesyntax;

public class Square extends Figure {
    static final int SIDE_COUNT = 4;
    private double side;

    public Square() {
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square" + ", area: "
                + getArea() + " sq.units" + ", side: "
                + getSide() + " units" + ", perimeter: " + getPerimeter()
                + " units" + ", color: " + getColor());
    }

    @Override
    public double getPerimeter() {
        return side * SIDE_COUNT;
    }
}
