package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(Color color, String name, double side) {
        super(color, name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                       + "area: %.1f sq.units, "
                       + "side: %.1f units, "
                       + "color: %s\n",
                getName(), getArea(), side, getColor());
    }
}
