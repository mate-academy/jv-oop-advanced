package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String getRandomParameters() {
        return "Figure: square, area: " + area()
                + " sq.units, side: " + side
                + " units, color: " + color;
    }
}
