package core.basesyntax.models;

public class Rectangle extends Figure {
    public static final double DEFAULT_BOTTOM = 15;
    public static final double DEFAULT_HEIGHT = 5;
    private double bottom;
    private double height;

    public Rectangle() {
        bottom = DEFAULT_BOTTOM;
        height = DEFAULT_HEIGHT;
    }

    @Override
    public void draw() {
        System.out.printf("Square{color:%s, area:%.2f, bottom:%.2f, height:%.2f}%n",
                color,
                get_area(),
                bottom,
                height
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
