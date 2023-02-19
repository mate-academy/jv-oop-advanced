package core.basesyntax;

public class Square extends Figure {
    private double side;

    Square(String color, double side) {
        super(color);
        side = this.side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
