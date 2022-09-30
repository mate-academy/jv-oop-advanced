package core.basesyntax.models;

public class Rectangle extends Figure {
    private static final String FIGURE_NAME = "rectangle";
    private static final double DEFAULT_BOTTOM = 15;
    private static final double DEFAULT_HEIGHT = 5;
    private double bottom;
    private double height;

    public Rectangle() {
        bottom = DEFAULT_BOTTOM;
        height = DEFAULT_HEIGHT;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area:%.2f, bottom:%.2f, height:%.2f, color:%s%n",
                FIGURE_NAME,
                get_area(),
                bottom,
                height,
                color.toLowerCase()
        );
    }

    @Override
    public double get_area() {
        return bottom * height;
    }

    @Override
    public Rectangle setRandomProperties() {
        super.setRandomProperties();
        bottom = random.nextDouble() * PROPERTY_MULTIPLIER;
        height = random.nextDouble() * PROPERTY_MULTIPLIER;
        return this;
    }
}
