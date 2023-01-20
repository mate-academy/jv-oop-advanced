package core.basesyntax;

public class Rectangle extends Figure {
    private int side;
    private int length;

    public Rectangle(String color, int side, int length) {
        super(color);
        this.side = side;
        this.length = length;
    }

    @Override
    public double getArea() {
        return side * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getName() + ",  area: " + getArea() + "sq.units" + "  side: "
                + side + "units" + "  length: " + length + "units" + "  color: " + getColor());
    }
}
