package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color, FigureType.SQUARE);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType() + ", area: " + String.format("%.2f", area())
                + " sq.units, side: " + getSide() + " units, color: " + getColor());
    }
}
