package core.basesyntax.models;

public class RightTriangle extends Figure {
    public static final double DEFAULT_HEIGHT = 10;
    public static final double DEFAULT_BASE = 5;
    private double base;
    private double height;

    public RightTriangle() {
        base = DEFAULT_BASE;
        height = DEFAULT_HEIGHT;
    }

    @Override
    public void draw() {
        System.out.printf("Square{color:%s, area:%.2f, base:%.2f, height:%.2f}%n",
                color,
                get_area(),
                base,
                height
        );
    }

    @Override
    public double get_area() {
        return (base * height) / 2;
    }

    @Override
    public RightTriangle setRandomProperties() {
        super.setRandomProperties();
        base = random.nextDouble() * PROPERTY_MULTIPLIER;
        height = random.nextDouble() * PROPERTY_MULTIPLIER;
        return this;
    }
}
