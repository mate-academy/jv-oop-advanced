package core.basesyntax;

public class Square extends Figure {
    private static final String NAME = "square";
    private int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
        setName(NAME);
        calculateArea();
    }

    public Square() {
        setName(NAME);
    }

    @Override
    public void calculateArea() {
        setArea(side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units,"
                + "color: " + getColor());
    }
}
