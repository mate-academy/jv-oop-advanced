package core.basesyntax;

public class Square extends Figure {
    private static final String name = "square";
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: " + name
                + ", area: " + df.format(getArea()) + " sq.units"
                + ", side: " + this.side
                + ", color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
