package core.basesyntax;

public class Rectangle implements Figure {
    private int width;
    private int heights;
    private Color color;

    public Rectangle(int width, int heights, Color color) {
        this.color = color;
        this.width = width;
        this.heights = heights;
    }

    @Override
    public double getArea() {
        return width * heights;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle area = " + getArea() + ", color: "
                + color.name() + ", width: " + width + ", heights: " + heights);
    }
}
