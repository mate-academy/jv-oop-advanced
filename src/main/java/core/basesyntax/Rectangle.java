package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle, area: %.3f sq.units, width: %s "
                        + "units, height: %s units, color: %s",
                calculateArea(), width, height, color));
    }

}
