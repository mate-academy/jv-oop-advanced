package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public Double getArea() {
        return (double)side * side;
    }

    @Override
    public void draw() {
        System.out.format("Figure: square, area: %f, side: %d, color: %s",
                getArea(), getSide(), getColor());
    }
}
