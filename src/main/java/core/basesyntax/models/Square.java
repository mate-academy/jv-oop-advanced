package core.basesyntax.models;

public class Square extends Figure {
    private static final String FIGURE_NAME = "square";
    private static final double DEFAULT_SIDE = 5;
    private double side;

    public Square() {
        side = DEFAULT_SIDE;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area:%.2f, side:%.2f, color:%s%n",
                FIGURE_NAME,
                get_area(),
                side,
                color.toLowerCase()
        );
    }

    @Override
    public double get_area() {
        return side * side;
    }

    @Override
    public Square setRandomProperties() {
        super.setRandomProperties();
        side = random.nextDouble() * PROPERTY_MULTIPLIER;
        return this;
    }
}
