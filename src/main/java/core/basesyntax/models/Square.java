package core.basesyntax.models;

public class Square extends Figure {
    public static final double DEFAULT_SIDE = 5;
    private double side;

    public Square() {
        side = DEFAULT_SIDE;
    }

    @Override
    public void draw() {
        System.out.printf("Square{color:%s, area:%.2f, side:%.2f}%n", color, get_area(), side);
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
