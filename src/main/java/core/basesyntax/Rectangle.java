package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int width;

    public Rectangle(int height, int width, Color color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public static Rectangle getRandomRectangle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Rectangle(
                getRandomDimension(),
                getRandomDimension(),
                colorSupplier.getRandomColor()
        );
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area "
                        + getArea()
                        + ", height "
                        + height
                        + ", width "
                        + width
                        + ", color: "
                        + getColor()
        );
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
