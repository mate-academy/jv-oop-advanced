package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        double result = Math.pow(side, 2);
        double scale = Math.pow(10, 1);
        return Math.ceil(result * scale) / scale;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + getArea() + " sq.units, side: "
                + side + " units, color: "
                + getColor());
    }
}
