package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double areaCalculator() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + areaCalculator()
                + " sq.units, side: " + side + " units, color: " + getColor());

    }
}

