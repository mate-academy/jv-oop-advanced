package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %f, width: %f, height: %f, color: %s\n",
                getArea(),
                width,
                height,
                color
        );
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
