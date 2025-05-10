package core.basesyntax;

public class Square extends Figure implements CalculateArea {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void figureInfo() {
        System.out.println(String.format("Figure: square, area: %f sq.units,"
                + " side:%f units, color: %s",getArea(),side,super.getColor()));
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
