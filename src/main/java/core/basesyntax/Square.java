package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, ColorType color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, side - " + side + ", Area - "
                + getArea() + ", Color : " + getColor().toLowerCase());
    }
}
