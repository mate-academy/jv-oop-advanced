package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, color: %s, side: %d units, area: %.1f sq. units\n",
                getName(), getColor(), side, getArea());
    }

}
