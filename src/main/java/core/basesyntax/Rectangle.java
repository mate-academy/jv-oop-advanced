package core.basesyntax;

public class Rectangle extends Figure {

    private int height;
    private int width;
    private String color;

    public Rectangle(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public String canDraw() {
        return String.format("Figure: rectangle, area: %.2f sq.units, height: %d units, "
                + "width: %d units, color: %s", (float) height * width, height, width, color);
    }
}
