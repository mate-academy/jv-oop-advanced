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
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeName() + ", area: "
                + String.format("%.2f", getArea())
                + " sq.units, side: " + getSide() + " units, color: " + getColor());
    }
}
