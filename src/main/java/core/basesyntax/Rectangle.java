package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int width;

    public Rectangle(int height, int width, Color color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area "
                        + calculateArea()
                        + ", height "
                        + height
                        + ", width "
                        + width
                        + ", color: "
                        + getColor()
        );
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
