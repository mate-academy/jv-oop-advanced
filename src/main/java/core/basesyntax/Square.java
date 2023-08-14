package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: square, area: %.1f sq.units, side: "
                        + "%.1f, color: %s", calculateArea(), getSide(), getColor()));
    }
}
