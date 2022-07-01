package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
        setType(FigureType.SQUARE);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure:"
                + getType()
                + ", area: " + getArea() + " sq.units,"
                + " side: " + side + " units,"
                + " color: " + getColor());
    }
}
