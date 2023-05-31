package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int heights;

    public Rectangle(int width, int heights, Color color) {
        super.color = color;
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
