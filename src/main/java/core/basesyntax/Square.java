package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
        side = random.nextDouble();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getData() {
        return "Figure: square, area: " + area + " sq.units, side: " + side
                + " units, color: " + color;
    }
}
