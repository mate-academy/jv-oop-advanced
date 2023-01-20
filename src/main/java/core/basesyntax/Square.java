package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: " + getClass().getName() + ",  area: " + getArea() + "sq.units"
                + "  side: " + side + "units" + "  color: " + getColor());
    }
}
