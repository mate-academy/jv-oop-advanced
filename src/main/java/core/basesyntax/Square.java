package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this();
        this.side = side;
        setColor(color);
        calculateArea();
    }

    public Square() {
        super(FigureType.SQUARE.name());
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
