package core.basesyntax.models;

public class IsoscelesTrapezoid extends Figure {
    public static final double DEFAULT_TOP = 5;
    public static final double DEFAULT_BOTTOM = 16;
    public static final double DEFAULT_HEIGHT = 5;
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
        System.out.printf("IsoscelesTrapezoid{color:%s, area:%.2f, topSide:%.2f, "
                        + "bottomSide:%.2f, height:%.2f}%n",
                color,
                get_area(),
                topSide,
                bottomSide,
                height
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
