package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:"
                + df.format(getArea()) + "sq. units, side: "
                + df.format(side) + "units, color: "
                + getColor());
    }
}
