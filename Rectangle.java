package core.basesyntax;

public class Rectangle implements Figure {
    private int width;
    private int height;
    private Color color;

    public String figureInfo() {
        return "Figure : Rectangle, Area :" + getArea() + " Width: " + width + " Height: " + height + " Color: " + color;
    }

    public Rectangle(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
