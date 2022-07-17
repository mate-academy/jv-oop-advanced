package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
    return side * side;
    }

    @Override
    void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side + " units, color: " + super.color);
    }
}
