package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + formatDouble(getArea())
                + " sq.units, side: " + formatDouble(side)
                + " units, color: " + getColor());
    }
}
