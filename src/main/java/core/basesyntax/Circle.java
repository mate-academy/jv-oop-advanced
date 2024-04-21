package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public static Circle getRandomCircle() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Circle(
                getRandomDimension(),
                colorSupplier.getRandomColor()
        );
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area "
                + getArea()
                + ", radius: "
                + radius
                + ", color: "
                + getColor()
        );
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
