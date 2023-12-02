package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.1f sq. units, height: %d units, width: %d units, color: %s\n"
                , getArea(), height, width, color);
    }
}
