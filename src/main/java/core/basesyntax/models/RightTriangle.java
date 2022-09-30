package core.basesyntax.models;

public class RightTriangle extends Figure {
    private static final String FIGURE_NAME = "rightTriangle";
    private static final double DEFAULT_HEIGHT = 10;
    private static final double DEFAULT_BASE = 5;
    private double base;
    private double height;

    public RightTriangle() {
        base = DEFAULT_BASE;
        height = DEFAULT_HEIGHT;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area:%.2f, base:%.2f, height:%.2f, color:%s%n",
                FIGURE_NAME,
                get_area(),
                base,
                height,
                color.toLowerCase()
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
