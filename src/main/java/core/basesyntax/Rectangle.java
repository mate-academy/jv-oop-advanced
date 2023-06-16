package core.basesyntax;

public class Rectangle extends Figure {

    private int height;
    private int width;
    private String color;

    public Rectangle(int height, int width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return (float) height * width;
    }

    @Override
    public String canDraw() {
        return String.format("Figure: rectangle, area: %.2f sq.units, height: %d units, "
                + "width: %d units, color: %s", area(), height, width, getColor());
    }
}
