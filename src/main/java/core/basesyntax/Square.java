package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area:" + getArea() + " sq.units, side:" + side
                + " units, color:" + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
