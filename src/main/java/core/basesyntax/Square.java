package core.basesyntax;

public class Square extends Figure {
    private final String name;
    private final double side;

    public Square(String color, double side) {
        super(color);
        name = "square";
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, area: %.3f sq.units, side: %s units, "
                        + "color: %s",
                name, getArea(), side, color));
    }
}
