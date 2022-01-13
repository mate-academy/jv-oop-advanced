package core.basesyntax.entities;

public class Square extends Figure {
    private static final int NUMBER_OF_SIDES = 4;
    private Integer side;

    public Square() {
    }

    public Square(Color color, Integer side) {
        super(color);
        this.side = side;
    }

    public Square(Integer side, Color color) {
        this.side = side;
        this.setColor(color);
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * NUMBER_OF_SIDES;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea() + " sq.units"
                + ", perimeter: " + getPerimeter()
                + ", side: " + side
                + ", color: " + getColor());
    }

    @Override
    public Figure clone() {
        return new Square(getColor(), side);
    }
}
