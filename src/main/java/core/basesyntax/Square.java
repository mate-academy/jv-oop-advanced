package core.basesyntax;

public class Square extends Figure implements AreaCalculator {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drow() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: "
                          + side + " units, color: " + super.getColor());
    }
}
