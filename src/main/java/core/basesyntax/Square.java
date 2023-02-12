package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(double side, Color color) {
        this.side = side;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return (double) (side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + "units "
                + "color: " + getColor());
    }
}
