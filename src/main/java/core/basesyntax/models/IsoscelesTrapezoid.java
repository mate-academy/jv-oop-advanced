package core.basesyntax.models;

public class IsoscelesTrapezoid extends Figure {
    private static final String FIGURE_NAME = "isoscelesTrapezoid";
    private static final double DEFAULT_TOP = 5;
    private static final double DEFAULT_BOTTOM = 16;
    private static final double DEFAULT_HEIGHT = 5;
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid() {
        topSide = DEFAULT_TOP;
        bottomSide = DEFAULT_BOTTOM;
        height = DEFAULT_HEIGHT;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area:%.2f, topSide:%.2f, "
                        + "bottomSide:%.2f, height:%.2f, color:%s%n",
                FIGURE_NAME,
                get_area(),
                topSide,
                bottomSide,
                height,
                color.toLowerCase()
        );
    }

    @Override
    public double get_area() {
        return ((bottomSide + topSide) / 2) * height;
    }

    @Override
    public IsoscelesTrapezoid setRandomProperties() {
        super.setRandomProperties();
        topSide = random.nextDouble() * PROPERTY_MULTIPLIER;
        bottomSide = random.nextDouble() * PROPERTY_MULTIPLIER;
        height = random.nextDouble() * PROPERTY_MULTIPLIER;
        return this;
    }
}
