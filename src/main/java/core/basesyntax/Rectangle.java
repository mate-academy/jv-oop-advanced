package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area: %.3f sq.units, width: %s "
                        + "units, height: %s units, color: %s",
                calculateArea(), width, length, color));
    }

}
