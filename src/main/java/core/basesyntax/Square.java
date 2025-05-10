package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square\n"
                + "area: " + findArea() + "sq.units\n"
                + "side: " + side + "units\n"
                + "color: " + getColor());
    }

    @Override
    public double findArea() {
        return side * side;
    }
}
