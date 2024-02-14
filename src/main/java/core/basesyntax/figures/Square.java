package core.basesyntax.figures;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s\nArea: %.2f\nSide: %d\nColor: %s\n",
                getClass().getSimpleName(), getArea(), side, getColor());
    }
}
