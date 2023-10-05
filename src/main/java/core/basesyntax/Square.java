package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(double area, Color color, double side) {
        super(area, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double countArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + countArea() + " sq.units, side: "
                + getSide() + " units, color: "
                + getColor());
    }
}
