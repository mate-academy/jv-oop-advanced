package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %1.1f sq. units, side length: %d units, color: %s\n",
                getName(), getArea(), side, getColor());
    }
}
